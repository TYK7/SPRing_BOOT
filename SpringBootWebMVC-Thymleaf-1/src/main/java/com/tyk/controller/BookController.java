package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyk.binding.Book;

@Controller
public class BookController {
	@GetMapping("/")
	public String getForm(Model model)
	{
		
		Book book= new Book();
		model.addAttribute("book", book);
		return "register";
	}
	
	
	@PostMapping("/book")
	public String getBookDta(Book boo,Model model)
	{
		
		System.out.println(boo);
		model.addAttribute("msg", "Registration Was Successfully Completed....!");
		return "success";
	}

}
