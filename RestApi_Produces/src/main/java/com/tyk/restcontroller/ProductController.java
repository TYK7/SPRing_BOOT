package com.tyk.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.binding.Product;
import com.tyk.binding.Product2;

@RestController
public class ProductController {
	
	@GetMapping( value="product",produces = {"application/xml","application/json"})
	public ResponseEntity<Product>getProduct()
	{
		Product pro= new Product();
		pro.setProductId(102);
		pro.setProductName("JeansPant");
		pro.setProductPrice(897.9);
		
		return new ResponseEntity<Product>(pro,HttpStatus.OK);
	}
	@GetMapping("/productList")
	public ResponseEntity<List<Product2>> getListOfProducts()
	{
		Product2 p= new Product2(103,"Pens",20.2);
		Product2 p1= new Product2(104,"Books",90.9);
		Product2 p2= new Product2(105,"Shirts",600.0);
		Product2 p3= new Product2(106,"Laptop",67000.5);
		List<Product2> productList = Arrays.asList(p,p1,p2,p3);
		return new ResponseEntity<List<Product2>>(productList,HttpStatus.OK);
		
	}

}
