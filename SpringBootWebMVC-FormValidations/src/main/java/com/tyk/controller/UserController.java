package com.tyk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyk.binding.Users;
@Controller
public class UserController {
	@GetMapping("/")
	public String getUserForm(Model model)
	{
		
		Users user= new Users();
		model.addAttribute("users", user);
		return "register";
	}
	
	@PostMapping("/userReg")
	public String getConfirm( @Valid Users users, BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "register";
		}
		System.out.println(users);
		model.addAttribute("msg", "Rigistration Completed");
		
		return "success" ;
	}
 
	
}
