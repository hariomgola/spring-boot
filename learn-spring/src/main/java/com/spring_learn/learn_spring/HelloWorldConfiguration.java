package com.spring_learn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String state, String country) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Hari";
	}
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		return new Person("Hari",21);
	}
	
	// Retreiving the beam that is already managed by spring by function call
	@Bean
	public Person person2() {
		return new Person(name(),age());
	}
	
	// Retreiving the beam that is already managed by spring by parameters
		@Bean
	public Person person3(String name,int age) {
		return new Person(name,age);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("New Delhi","Delhi");
	}
}
