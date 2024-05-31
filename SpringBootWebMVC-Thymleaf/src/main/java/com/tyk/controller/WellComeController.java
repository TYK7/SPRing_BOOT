package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WellComeController {

	@GetMapping("/")
	public String getMsg(Model model)
	{
		model.addAttribute("msg", "Welcome To Thymleaf Concepts");
		
		return "index";
	}
}
