package com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.Course;

// Here we are using spring JDBC Template
@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;

	public void insert(Course course) {
		String INSERT_QUERY = """
				   insert into courses(id,name,author)
				   values(?,?,?)
				""";
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(int id) {
		String DELETE_QUERY = """
				delete from courses where id=?
				""";
		springJdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course select(int id) {
		String SELECT_QUERY = """
				Select * from courses where id=?
				""";
		// Result Set -> Bean => Row Mapper
		// id
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
