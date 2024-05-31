package com.tyk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.entity.UserDetails;
import com.tyk.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepo;

	public UserDetails save(UserDetails user) {
		return userRepo.save(user);
	}

}
