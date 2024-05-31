package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.entity.Student;
import com.tyk.repository.StudentRepository;

@SpringBootApplication
public class SpringBootDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpa2Application.class, args);
	StudentRepository studentRepository = context.getBean(StudentRepository.class);
	Student std= new Student();
	std.setStdName("Venu Gopal");
	std.setStdClgName("Vemu Institute Of Technology");
	std.setStdBranch("Civil");
	studentRepository.save(std);
	
	
	
	}

}
