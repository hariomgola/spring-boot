package com.spring_learn.learn_spring.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("|> Mario is Jumping");
	}
	public void down() {
		System.out.println("|> Mario is in hole");
	}
	public void left() {
		System.out.println("|> Mario is going back");
	}
	public void right() {
		System.out.println("|> Mario is going forward");
	}
}
