package com.tyk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.EmpDetails;

public interface EmpDetailseRepository extends JpaRepository<EmpDetails, Serializable> {

}
