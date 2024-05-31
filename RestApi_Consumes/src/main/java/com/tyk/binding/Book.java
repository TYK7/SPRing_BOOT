package com.tyk.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;

}
