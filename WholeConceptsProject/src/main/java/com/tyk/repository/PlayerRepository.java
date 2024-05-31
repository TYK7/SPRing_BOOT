package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.CricketAcademy;

public interface PlayerRepository extends JpaRepository<CricketAcademy,  Integer>{

}
