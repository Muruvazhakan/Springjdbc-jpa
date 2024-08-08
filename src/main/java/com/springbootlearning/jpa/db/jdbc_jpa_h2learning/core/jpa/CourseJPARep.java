package com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.jpa;

import org.springframework.stereotype.Repository;

import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARep {
	
	@PersistenceContext
	private	EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void delete(long id) {
		Course deletecourse= entityManager.find(Course.class, id);
		 entityManager.remove(deletecourse);
	}
}
