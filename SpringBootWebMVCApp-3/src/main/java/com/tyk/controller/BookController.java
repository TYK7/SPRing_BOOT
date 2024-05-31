package com.tyk.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyk.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/books")
	public String getBooksDetailse(Model m)
	{
		Book b= new Book(101,"SpringBoot",897.09);
		Book b1= new Book(102,"SpringDataJpa",987.0);
		Book b2= new Book(103,"SpringSecurity",856.2);
		List<Book> list = Arrays.asList(b,b1,b2);
		m.addAttribute("list",list);
//		m.addAllAttributes(null)
//		m.addAttribute("b", b);
//		m.addAttribute("b1", b1);
//		m.addAttribute("b2", b2);
		return "books";
	}
	
	
	@GetMapping("/b")
	public String getBookDetailse(Model m)
	{
		Book b= new Book(101,"SpringBoot",897.09);
//		Book b1= new Book(102,"SpringDataJpa",987.0);
//		Book b2= new Book(103,"SpringSecurity",856.2);
	
//		m.addAllAttributes(null)
		m.addAttribute("b", b);
//		m.addAttribute("b1", b1);
//		m.addAttribute("b2", b2);
		return "book";
	}

}
