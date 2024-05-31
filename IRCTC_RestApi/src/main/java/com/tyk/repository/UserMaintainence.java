package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.Ticket;

public interface UserMaintainence extends JpaRepository<Ticket, Integer> {

}
