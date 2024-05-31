package com.tyk.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.tyk.entity.Book;

@Service
public class BookController {
	
	public void invokeBooks()
	{
		String apiUrl="http://localhost:9090/books";
		WebClient client = WebClient.create();
		
		String block = client.get()//Get Request
		.uri(apiUrl)  //End Point URL
		.retrieve()  //Retrieving Response Body
		.bodyToMono(String.class) // Bind Response Data
		.block(); //make as Synchronous
		System.out.println(block);
	}
	
	public void invokeBooksAsy()
	{
		String apiUrl="http://localhost:9090/books";
		WebClient client = WebClient.create();
		
		client.get()//Get Request
		.uri(apiUrl)  //End Point URL
		.retrieve()  //Retrieving Response Body
		.bodyToMono(Book[].class) // Bind Response Data
		.subscribe(BookController::bookListener);
		System.out.println("*********Done*****************8");
				
		
	}
	private static void bookListener(Book[] book) {
		
		
		for(Book b: book)
		{
			System.out.println(b);
		}
	}

	public void invokeAddBook()
	{
		String apiUrl="http://localhost:9090/addBook";
		WebClient create = WebClient.create();
		
		Book book= new Book();
		book.setBookName("Angular");
		book.setBookPrice(2993.0);
		book.setBooksQuantity(24);
		
		String block = create.post() // HTTP Post Request
				.uri(apiUrl)  // Http End Point Url
				.bodyValue(book) // Http Request Body Data
				.retrieve()  // Retrieve the Http Response Body Data
				.bodyToMono(String.class) // Binding The Response Data
				.block(); //Make A Synchronous
		
		System.out.println(block);
	}

}
