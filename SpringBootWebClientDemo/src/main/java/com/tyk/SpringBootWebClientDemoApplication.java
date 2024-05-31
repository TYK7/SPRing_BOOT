package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.service.BookController;

@SpringBootApplication
public class SpringBootWebClientDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootWebClientDemoApplication.class, args);
		BookController bean = run.getBean(BookController.class);
		//bean.invokeAddBook();
		//bean.invokeBooks();
		bean.invokeBooksAsy();
	
	
	}

}
