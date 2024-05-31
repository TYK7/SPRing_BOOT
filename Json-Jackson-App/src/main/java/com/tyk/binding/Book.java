package com.tyk.binding;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder(alphabetic = true)
public class Book {
	
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;
	
	private Author author;

}
