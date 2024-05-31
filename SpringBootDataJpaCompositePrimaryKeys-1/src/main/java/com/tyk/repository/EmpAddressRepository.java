package com.tyk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.EmpAddress;

public interface EmpAddressRepository extends JpaRepository<EmpAddress, Serializable> {

}
