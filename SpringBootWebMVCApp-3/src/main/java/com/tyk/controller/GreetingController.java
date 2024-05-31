package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
	@GetMapping("/greet")
	public String getGreetings(Model model)
	{
		model.addAttribute("msg","hello Good Morning");
		
		return "greet";
		
	}

}
