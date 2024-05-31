package com.tyk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.binding.Book;
 
@RestController
public class BookController {
	
	@PostMapping(value="/newbook",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		System.out.println(book);
		// Logic to Store The Data In DB
		
		String msg="Book Added Sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}

}
