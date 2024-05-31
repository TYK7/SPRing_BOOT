package com.tyk.second;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.tyk.second.deo.DbConnect;
import com.tyk.second.service.AppManagement;
@Component
public class AppStartsMail implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("COmmand Line Runner ");
		
	}
	

}
