package com.tyk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name)
	{
		String s="Your  Book Name Is : "+name +" The Book Price Is: Rs 2899 ";
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	@GetMapping("/book/{bName}/{bAuthor}")
	public ResponseEntity<String>getBook(@PathVariable("bName") String bName,@PathVariable("bAuthor") String bAuthor)
	{
		String s="Your  Book Name Is : "+bName +" The Book Price Is: Rs 2899 "+ " And Book Author Is: "+bAuthor;
		return new ResponseEntity<String>(s,HttpStatus.OK);

	}

}
