package com.spring_learn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring_learn.learn_spring.game.GamingConsole;
import com.spring_learn.learn_spring.game.MarioGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		return new MarioGame();
	}

}
