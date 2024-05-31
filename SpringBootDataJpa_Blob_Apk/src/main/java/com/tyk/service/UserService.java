package com.tyk.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.entity.UserData;
import com.tyk.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public void saveUser() throws Exception
	{
		
		String imagePath="D:\\Pictures\\venuPhoto.jpg";
		long size = Files.size(Paths.get(imagePath));
		byte []arr= new byte[(int) size];
		FileInputStream fis= new FileInputStream(new File(imagePath));
		
		fis.read(arr);
		fis.close();
		UserData user= new UserData();
		
		user.setUserName("Venu");
		user.setUserEmail("venugopal@gmail.com");
		user.setUserPhoto(arr);
		//repository.save(user);
		Optional<UserData> findById = repository.findById(1);
		
		if(findById.isPresent())
		{
			System.out.println(findById.get());
			System.out.println("Date is There");
			
		}
	}
	

}
