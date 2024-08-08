package com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.SpringDatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.Course;

public interface CourseSpringDatajpaRep extends JpaRepository<Course, Long> {
	List <Course> findByAuthor(String author);
	List <Course> findByName(String name);
}
