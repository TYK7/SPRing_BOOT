package com.tyk;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.entity.User;
import com.tyk.repository.UserRepository;

@SpringBootApplication
public class SpringBootDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpa1Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		List<User> findbycounty = userRepository.findByCountry("India");
//		findbycounty.forEach(user ->{
//			System.out.println(user);
//		});
//		List<User> findByAge = userRepository.findByAge(24);
//		findByAge.forEach(user ->{
//			System.err.println(user);
//		});
//		
//		List<User> countryIn = userRepository.findByCountryAndAgeAndGender("India",24,"Female");
//		countryIn.forEach(user->{
//			System.out.println(user);
//		});

//		User u1= new User(101,"Venu",24,"Male","India");
//		
//		userRepository.save(u1);
//		
//		 User u2= new User(102,"Vijay",23,"Male","India");
//		 
//		  User u3= new User(103,"Gireesh",24,"Male","Dubai");
//		 
//		  User u4= new User(104,"Rajesh",22,"Male","USA");
//		 
//		userRepository.saveAll(Arrays.asList(u2,u3,u4));
		
//		Optional<User> findById = userRepository.findById(105);
//		if(findById.isPresent())
//		{
//		
//		System.out.println(findById.get());
//		}
		/*
		 * Iterable<User> findAllById =
		 * userRepository.findAllById(Arrays.asList(101,102,103,104));
		 * findAllById.forEach(user-> { System.out.println(user); });
		 */
		/*
		 * Iterable<User> findAll = userRepository.findAll(); findAll.forEach(user->{
		 * System.out.println(user);
		 * 
		 * });
		 */
		//System.out.println("Total Records Present in The Table Is:"+userRepository.count());
		//System.out.println(userRepository.existsById(104));
//		userRepository.deleteById(104);
//		userRepository.delete(u3);
		 // userRepository.deleteAllById(Arrays.asList(101,102));
		List<User> hql = userRepository.allUsersHql();
		hql.forEach(user->{
			System.out.println(user);
		});
		List<User> sql = userRepository.allUsersSql();
		sql.forEach(user->{
			System.out.println(user);
		});
		List<User> sql1 = userRepository.getAllUsersByCountry("Dubai");
		sql1.forEach(user->{
			System.out.println(user);
		});
		  
		
	}

	
}
