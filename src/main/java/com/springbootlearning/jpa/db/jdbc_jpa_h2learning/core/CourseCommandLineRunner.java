package com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.SpringDatajpa.CourseSpringDatajpaRep;
//import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.Course;
//import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.jdbc.CourseRepo;
import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.jpa.CourseJPARep;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseRepo repo;
//	@Autowired
//	private CourseJPARep repo;
	@Autowired
	private  CourseSpringDatajpaRep repo ;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Course(1,"First","asdgfh"));
		repo.save(new Course(2,"sec","34dsf"));
		repo.save(new Course(3,"thir","xbcvbc"));
		repo.deleteById(2L);
		
		System.out.println(repo.findById(1L));
//		System.out.println(repo.findById(2));
		System.out.println(repo.findById(3L));
		
		System.out.println(repo.findByAuthor("asdgfh"));
		System.out.println(repo.findByAuthor(""));
		
		System.out.println(repo.findByName("First"));
		System.out.println(repo.findByName(""));
	}
	
	

}
