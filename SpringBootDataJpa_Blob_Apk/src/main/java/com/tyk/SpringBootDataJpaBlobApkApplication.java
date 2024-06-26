package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.service.UserService;

@SpringBootApplication
public class SpringBootDataJpaBlobApkApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaBlobApkApplication.class, args);
		
		UserService userService = context.getBean(UserService.class);
		userService.saveUser();
		
		
	}

}
