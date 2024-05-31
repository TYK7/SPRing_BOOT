package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer> {

}
