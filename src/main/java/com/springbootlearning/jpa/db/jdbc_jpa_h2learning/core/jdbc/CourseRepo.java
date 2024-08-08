package com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbootlearning.jpa.db.jdbc_jpa_h2learning.core.Course;

@Repository
public class CourseRepo {

	@Autowired
  private	JdbcTemplate springJdbcTempaltes;
  
  private static String insert_query=
		  """
  		insert into course (id,name,author) values(?,?,?);
  		
  		""";
  
  private static String delete_query=
		  """
  		delete from course where id = ?;
  		
  		""";
  
  
  private static String select_query=
		  """
  		select * from course where id = ?;
  		
  		""";
		  
  public void insert(Course course) {
	  springJdbcTempaltes.update(insert_query, course.getId(),course.getName(),course.getAuthor());
  }
  
  public void delete(long id) {
	  springJdbcTempaltes.update(delete_query, id);
  }
  
  public Course findById(long id) {
	return  springJdbcTempaltes.queryForObject(select_query, new BeanPropertyRowMapper<>(Course.class),id);
	  
	  
  }
  
}
