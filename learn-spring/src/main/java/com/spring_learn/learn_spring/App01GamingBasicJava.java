package com.spring_learn.learn_spring;

import com.spring_learn.learn_spring.game.GameRunner;
import com.spring_learn.learn_spring.game.superContra;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var game = new MarioGame();
		var game = new superContra(); // 1: Object Creation
		var gameRunner = new GameRunner(game);
		// 2: Object Creation + Wiring of Dependencies
		// Game is Dependency of GameRunner class
		// We are injecting the dependencies of wired of game for gameRunner classes
		gameRunner.run();
	}
}
