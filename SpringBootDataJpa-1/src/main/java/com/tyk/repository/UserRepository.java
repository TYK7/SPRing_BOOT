package com.tyk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tyk.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
//
	@Query(value="From User")
	public List<User>allUsersHql();
	
	@Query(value="select * from user_details", nativeQuery = true)
	public List<User>allUsersSql();
	
	@Query(value="from User where country=:name")
	public List<User> getAllUsersByCountry(String name);
}
