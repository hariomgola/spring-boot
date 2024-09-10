package com.spring.learn_spring_framework;

public class ContraGame implements GamingInterface {
	private String Game = "Mario";

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
		System.out.println("  ------" + Game + "------");
		this.up();
		this.down();
		this.left();
		this.right();
	}
}
