package com.spring.learn_spring_framework;

public class ContraGame {
	private String Game = "Mario";

	// Constructor
	public ContraGame() {
		System.out.println("------" + Game + "------");
	}

	// Functionality
	public void up() {
		System.out.println(" |> " + Game + " - " + "Gun up");
	}

	public void down() {
		System.out.println(" |> " + Game + " - " + "Sitting");
	}

	public void left() {
		System.out.println(" |> " + Game + " - " + "Going Backward Gun");
	}

	public void right() {
		System.out.println(" |> " + Game + " - " + "Going Forward Gun");
	}

	// All Control Function
	public void allControl() {
		this.up();
		this.down();
		this.left();
		this.right();
	}
}
