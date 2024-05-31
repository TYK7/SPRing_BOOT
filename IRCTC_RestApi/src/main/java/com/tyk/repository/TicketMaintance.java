package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyk.entity.UserDatails;
@Repository
public interface TicketMaintance extends JpaRepository<UserDatails, String> {

	

}
