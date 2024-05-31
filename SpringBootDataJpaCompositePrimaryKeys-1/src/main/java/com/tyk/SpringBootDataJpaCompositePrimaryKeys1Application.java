package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.service.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaCompositePrimaryKeys1Application {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDataJpaCompositePrimaryKeys1Application.class, args);
	
	
		EmployeeService employeeService = run.getBean(EmployeeService.class);
		employeeService.saveEmp();
	}

}
