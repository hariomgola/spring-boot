package com.spring_learn.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_learn.learn_spring.game.GameRunner;
import com.spring_learn.learn_spring.game.GamingConsole;
import com.spring_learn.learn_spring.game.superContra;

public class App03GamingSpringBeams {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GamingConsole.class).down();
			context.getBean(GamingConsole.class).left();
			context.getBean(GamingConsole.class).right();
		}
	}
}
