package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWellcomeMsg()
	{
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg", "WellCome To RestFull Service Concepts Using Spring Web MVC");
		mav.setViewName("wel");
		return mav;
	}

}
