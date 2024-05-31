package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {
	
	@GetMapping("/wish")
	public ModelAndView getWishMsg()
	{
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg", "All The Best Guys...!!");
		mav.setViewName("wish");
		
		return mav;
	}

}
