package com.tyk.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyk.binding.Book;

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception {
		
		File jfile=new File("book.json");
		
		ObjectMapper om=new ObjectMapper();
		Book book = om.readValue(jfile, Book.class);
		System.out.println(book);
	}

}
