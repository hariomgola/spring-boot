package com.spring.learn_spring_framework;

public class GameRunner {
	private MarioGame game;

	// constructor
	public GameRunner(MarioGame game) {
		this.game = game;	
	}
	public void run() {
		System.out.println(" |> "+game);
		game.allControl();
	}
}
