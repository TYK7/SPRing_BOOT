package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public ModelAndView getWelMsg()
	{
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","WelCome To Spring Rest Full Concepts");
		mav.setViewName("welcome");
		return mav;
	}

}
