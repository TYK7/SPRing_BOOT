package com.tyk.service;

import java.util.List;

import com.tyk.entity.Book;



public interface BookService {
	
	public String addOrUpdateBook(Book book);
	
	List<Book> getAllBooks();
	
	//String updateBook(Book book);
	
	String deleteBook(Integer bookId);

}
