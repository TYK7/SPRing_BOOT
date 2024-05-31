package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tyk.entity.Book;

@SpringBootApplication
public class RestApiClientRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiClientRestTemplateApplication.class, args);
		String url="http://localhost:9090/getBook/1";
		RestTemplate rt= new RestTemplate();
		ResponseEntity<Book> entity = rt.getForEntity(url, Book.class);
		Book body = entity.getBody();
		System.out.println(body);
	}

}
