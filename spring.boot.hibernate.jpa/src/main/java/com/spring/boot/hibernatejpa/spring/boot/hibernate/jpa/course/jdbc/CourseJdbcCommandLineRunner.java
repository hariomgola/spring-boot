package com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.Course;

//@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {

		// Insert
		repository.insert(new Course(1, "Java", "Hari"));
		repository.insert(new Course(2, "JavaScript", "Hari"));
		repository.insert(new Course(3, "React", "Hari"));
		repository.insert(new Course(4, "Angular", "Hari"));
		repository.insert(new Course(5, "Node", "Hari"));
		
		// Read
		System.out.println("----->"+repository.select(2));
		System.out.println("----->"+repository.select(3));
		
		// Delete
		repository.delete(1);
	}

}
