package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@GetMapping("/welcome")
	public ModelAndView getMag()
	{
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg", "Wellcome To Spring Web MVC");
		mav.setViewName("welcome");
		
		return mav;
	}
	
	@GetMapping("/greetings")
	public ModelAndView getGreet()
	{
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("msg", "Good Evining Guys");
		mav.setViewName("greet");
		return mav;
	}

}
