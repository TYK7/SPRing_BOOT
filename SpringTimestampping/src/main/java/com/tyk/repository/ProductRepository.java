package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
