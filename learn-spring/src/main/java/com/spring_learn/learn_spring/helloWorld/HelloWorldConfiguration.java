package com.spring_learn.learn_spring.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {
};

record Address(String state, String country) {
};

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
		return new Person("Hari", 21);
	}

	// Retreiving the beam that is already managed by spring by function call
	@Bean
	@Primary
	public Person person2() {
		return new Person(name(), age());
	}

	// Retreiving the beam that is already managed by spring by parameters
	@Bean
	public Person person3(String name, int age, @Qualifier("address3qualifier") Address address2) {
		return new Person(name, age);
	}

	@Bean(name = "address1")
	public Address address() {
		return new Address("New Delhi", "Delhi");
	}

	@Bean(name = "address2")
	@Qualifier("address3qualifier")
	@Primary
	public Address address2() {
		return new Address("New Delhi - 2", "Delhi");
	}
}
