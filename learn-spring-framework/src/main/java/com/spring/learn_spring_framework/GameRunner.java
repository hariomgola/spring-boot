package com.spring.learn_spring_framework;

public class GameRunner {
	private GamingInterface game;

	// constructor
	public GameRunner(GamingInterface game) {
		this.game = game;
	}

	public void run() {
		System.out.println(" |> " + game);
		game.allControl();
	}
}
