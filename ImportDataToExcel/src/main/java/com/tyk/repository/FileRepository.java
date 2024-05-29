package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyk.entity.Files;

@Repository
public interface FileRepository extends JpaRepository<Files, Integer> {
 Files findByFileName(String fileName);
}
