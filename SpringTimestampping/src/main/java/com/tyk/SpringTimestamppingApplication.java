package com.tyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.entity.Product;
import com.tyk.repository.ProductRepository;

@SpringBootApplication
public class SpringTimestamppingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringTimestamppingApplication.class, args);
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Product pr= new Product();
		pr.setProductId(101);
		pr.setProductName("Seeds");
		pr.setProductPrice(27843.47);
		productRepository.save(pr);
		
	}

}
