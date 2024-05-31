package com.tyk.converter;

import com.google.gson.Gson;
import com.tyk.binding.Product;

public class JavaToJsonConvert {
	
	public static void main(String[] args) throws Exception{
		Product p= new Product();
		
		p.setProId(12);
		p.setProName("Laptop");
		p.setProPrice(5600.5);
		
		Gson g= new Gson();
		
		//convert Java Obj to Json
	 String json = g.toJson(p);
		
		System.out.println(json);
		// Convert Json to Java obj
//		Product product = g.fromJson(new FileReader(new File("pro.json")), Product.class);
//		System.out.println(product);
	}

}
