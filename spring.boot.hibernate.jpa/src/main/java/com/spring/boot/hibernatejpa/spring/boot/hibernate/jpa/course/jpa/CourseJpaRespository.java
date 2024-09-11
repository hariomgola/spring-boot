package com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.hibernatejpa.spring.boot.hibernate.jpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

// Here we are using JPA
@Repository
@Transactional
public class CourseJpaRespository {
//	@Autowired   - Instead of autowired we can also used below annotation
	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}

	public Course select(int id) {
		return entityManager.find(Course.class, id);
	}

	public void delete(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
