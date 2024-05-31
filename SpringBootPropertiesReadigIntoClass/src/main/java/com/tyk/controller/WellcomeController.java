package com.tyk.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.prop.AppProperties;

@RestController
public class WellcomeController {
	
	@Value("${message}")
	private String msg1;
	
	@Autowired
	private AppProperties pro;
	
	@GetMapping("/welcome")
	public String  wel()
	{
		
		return msg1;
	}
	
	@GetMapping("/")
	public String  welcome()
	{
		Map<String,String> msg2 = pro.getMessages();
		String wel = msg2.get("welcome");
		
		return wel;
	}
	
	@GetMapping("/greet")
	public String  greet()
	{
		Map<String,String> msg2 = pro.getMessages();
		String wel = msg2.get("greet");
		System.out.println(wel);
		return wel;
	}
	
	@GetMapping("/wish")
	public String  wish()
	{
		
		return  pro.getMessages().get("wish");
	}
	

}
