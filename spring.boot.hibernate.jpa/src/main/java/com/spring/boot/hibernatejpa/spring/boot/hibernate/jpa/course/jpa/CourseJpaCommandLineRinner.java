package com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.Course;
import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.jdbc.CourseJdbcRepository;

//@Component
public class CourseJpaCommandLineRinner implements CommandLineRunner {
	@Autowired
	private CourseJpaRespository repository;

	@Override
	public void run(String... args) throws Exception {

		// Insert
		repository.insert(new Course(1, "Java", "Hari-Jpa"));
		repository.insert(new Course(2, "JavaScript", "Hari-Jpa"));
		repository.insert(new Course(3, "React", "Hari-Jpa"));
		repository.insert(new Course(4, "Angular", "Hari-Jpa"));
		repository.insert(new Course(5, "Node", "Hari-Jpa"));

		// Read
		System.out.println("----->" + repository.select(2));
		System.out.println("----->" + repository.select(3));

		// Delete
		repository.delete(1);
	}
}
