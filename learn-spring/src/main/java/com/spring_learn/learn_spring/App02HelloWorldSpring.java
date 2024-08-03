package com.spring_learn.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_learn.learn_spring.game.GameRunner;
import com.spring_learn.learn_spring.game.MarioGame;
import com.spring_learn.learn_spring.game.superContra;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// Create a spring context to manage the things
	    // 1: Launch a spring application or spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2: configure the things that we want Spring to manage - @Configuration
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		
		// 3: Retrieving Beans manages by Spring
		System.out.println("|> Name    -        "+context.getBean("name"));
		System.out.println("|> Age     -        "+context.getBean("age"));
		System.out.println("|> Person  -        "+context.getBean("person"));
		System.out.println("|> Address -        "+context.getBean("address2"));
		
		System.out.println("|> Address -        "+context.getBean(Address.class));
		
		System.out.println("|> Person Method call -  "+context.getBean("person2"));
		System.out.println("|> Person Parameter call-"+context.getBean("person3"));
	}
}
 