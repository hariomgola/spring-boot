package com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.Course;
import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.jdbc.CourseJdbcRepository;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseSpringDataJpaRespository repository;

	@Override
	public void run(String... args) throws Exception {

		// Insert
		repository.save(new Course(1, "Java", "Hari-Spring-Jpa"));
		repository.save(new Course(2, "JavaScript", "Hari-Spring-Jpa"));
		repository.save(new Course(3, "React", "Hari-Spring-Jpa"));
		repository.save(new Course(4, "Angular", "Hari-Spring-Jpa"));
		repository.save(new Course(5, "Node", "Hari-Spring-Jpa---"));

		// Read
		System.out.println("----->" + repository.findById(2));
		System.out.println("----->" + repository.findById(3));

		System.out.println("----->" + repository.findAll());
		System.out.println("----->" + repository.count());
		System.out.println("----->" + repository.findByAuthor("Hari-Spring-Jpa---"));
		System.out.println("----->" + repository.findByName("Angular"));

		// Delete
		repository.deleteById(1);
	}
}
