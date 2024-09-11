package com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.Course;

public interface CourseSpringDataJpaRespository extends JpaRepository<Course, Integer> {
	List<Course> findByAuthor(String author);

	List<Course> findByName(String name);
}
