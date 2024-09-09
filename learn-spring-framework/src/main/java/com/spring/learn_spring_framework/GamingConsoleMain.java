package com.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Iteration 1 Simple plain java Code

public class GamingConsoleMain {

	public static void main(String[] args) {
		// Mario Game
		var m_Game = new MarioGame();
		// Contra Game 
		var c_Game = new ContraGame();
		
		// Passing the Game to Runner class
		GameRunner gameRunner = new GameRunner(m_Game);

		// Running game
		gameRunner.run();
	}

}
