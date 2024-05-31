package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyk.binding.Product;

@Controller
public class ProductController {
	@GetMapping("/")
	public String getProductForm(Model model)
	{
		Product product= new Product();
		model.addAttribute("product", product);
		return "register";
	}
	
	@PostMapping("/product")
	public String handleSubmission(Product pro,Model model)
	{
		System.out.println(pro);
		model.addAttribute("msg", "Product Saved Successfully..!!");
		
		
		return"success";
	}

}
