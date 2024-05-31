package com.tyk.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyk.binding.Author;
import com.tyk.binding.Book;

public class JavaToJasonConverter {
	
	public static void main(String[] args) throws Exception{
		Book book= new Book();
		book.setBookId(192);
		book.setBookName("Spring");
		book.setBookPrice(234.3);
		Author au= new Author();
		
		au.setAuthorMail("pakirappa@gmail.com");
		au.setAutorName("Pakirappa");
		au.setAuthorNum(8978118978l);
		book.setAuthor(au);
		ObjectMapper om= new ObjectMapper();
		om.writeValue(new File("book.json"), book);
		
		System.out.println("Conversion Co mpleted");
	}

}
