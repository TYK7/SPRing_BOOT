package com.tyk.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tyk.second.deo.DbConnect;
import com.tyk.second.service.AppManagement;

@SpringBootApplication
public class SecondBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SecondBootApplication.class, args);
		System.out.println(run.getClass().getName());
	}
	
	

}
 