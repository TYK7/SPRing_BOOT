package com.tyk.second.deo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyk.second.service.AppManagement;
@Configuration
public class DbConnect {
	public DbConnect() {
		// TODO Auto-generated constructor stub
		int k=1;
		System.out.println("BbConnect::COnstructor"+ ++k);
	}
	@Bean
	public DbConnect getObject()
	{
		DbConnect db= new DbConnect();
		return db;
	}
	
	@Bean
	public AppManagement getObj()
	{
		AppManagement am= new AppManagement();
		return am;
	}

}
