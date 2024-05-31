package com.tyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.entity.Book;
import com.tyk.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	@PostMapping("/addBook")
	public ResponseEntity<String>addBook(@RequestBody Book book)
	{
		
		return new ResponseEntity<String>(service.addOrUpdateBook(book),HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return new ResponseEntity<List<Book>>(service.getAllBooks(),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		return new ResponseEntity<String>(service.addOrUpdateBook(book),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId)
	{
		return new ResponseEntity<String>(service.deleteBook(bookId),HttpStatus.OK);
	}

}
