package com.tyk.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Book {
	
	
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;
	
	private Integer booksQuantity;

}
