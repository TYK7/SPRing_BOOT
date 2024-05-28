package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.UploadFile;

public interface UploadFileRepository extends JpaRepository<UploadFile, Integer> {

}
