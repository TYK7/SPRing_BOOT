package com.tyk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/welcome")
	public ResponseEntity<String> getWlcomeMsg()
	{
		String payLoad="Welcome To Rest Api Concepts";
		
		return new ResponseEntity<String>(payLoad,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreet()
	{
		return "Good Morning....!";
	}
	
	@GetMapping("/show")
	public ResponseEntity<String> getMsg(@RequestParam("name") String name,@RequestParam("age") Integer age)
	{
		String resPayLload=name+" ,WellCome To Our Life...!! You age Is: "+age;
		
		return new ResponseEntity<String>(resPayLload,HttpStatus.ACCEPTED);
	}

}
