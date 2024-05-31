package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.service.AccountService;

@SpringBootApplication
public class SpringBootDataJpaCompositePrimaryKeysApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaCompositePrimaryKeysApplication.class, args);
	
	AccountService bean = context.getBean(AccountService.class);
	bean.saveAccData();
	bean.getAccData();
	}

}
