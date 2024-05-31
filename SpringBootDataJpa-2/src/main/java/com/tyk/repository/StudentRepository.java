package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyk.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
