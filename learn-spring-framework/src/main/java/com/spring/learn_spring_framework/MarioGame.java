package com.spring.learn_spring_framework;

public class MarioGame {
	private String Game = "Mario";

	// Constructor
	public MarioGame() {
		System.out.println("------" + Game + "------");
	}

	// Functionality
	public void up() {
		System.out.println(" |> " + Game + " - " + "Jumping");
	}

	public void down() {
		System.out.println(" |> " + Game + " - " + "Sitting");
	}

	public void left() {
		System.out.println(" |> " + Game + " - " + "Going Backward");
	}

	public void right() {
		System.out.println(" |> " + Game + " - " + "Going Forward");
	}

	// All Control Function
	public void allControl() {
		this.up();
		this.down();
		this.left();
		this.right();
	}
}
