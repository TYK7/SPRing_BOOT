package com.tyk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyk.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
