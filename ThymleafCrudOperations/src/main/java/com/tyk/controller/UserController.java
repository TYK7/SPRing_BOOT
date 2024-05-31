package com.tyk.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.entity.UserDetails;
import com.tyk.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String openRegistrationForm(Model model) {
		UserDetails user= new UserDetails();
		model.addAttribute("user", user);
		
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveUserDetails(  UserDetails user, Model model) {
		UserDetails userDetails = service.save(user);
		UserDetails user1= new UserDetails();
		model.addAttribute("user", user1);
		if(userDetails!=null) {
			model.addAttribute("msg", "Successfully Saved");
		}
		else {
			model.addAttribute("msg","User saving is Failed ");
		}
		return "register";
	}

}
