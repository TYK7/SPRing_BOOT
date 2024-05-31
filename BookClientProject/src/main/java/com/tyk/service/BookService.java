package com.tyk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tyk.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private RestTemplate template;
	
	private  final static String apiUrl="http://localhost:9090/";
	
	public Book[] getAlBooks()
	{
		Book[] forObject = template.getForObject(apiUrl+"books",Book[].class);
		
		return forObject;
	}
	
	public Book getBookById(Integer bookId)
	{
		ResponseEntity<Book> forEntity = template.getForEntity(apiUrl+"getBook/"+bookId,Book.class);
		
		return forEntity.getBody();
	}
	
	public String deleteBook(Integer bookId)
	{
		template.delete(apiUrl+"delete/"+bookId,String.class);
		return "Book Deleted";
	}
       
	public String addBook(Book book)
	{
		ResponseEntity<String> responseEntity = template.postForEntity(apiUrl+"addBook", book, String.class);
		return responseEntity.getBody();
	}
	
	public String updateBook(Book book)
	{
		template.put(apiUrl+"update", book, String.class);
		return "Book Was Updated "; 
	}
}
