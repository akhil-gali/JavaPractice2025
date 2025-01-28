package com.java.interfaces.practice;

public interface Shape {
	void draw();
	default void fill() {
		System.out.println("filling with color");
		color();
	}
	private void color() {
		System.out.println("Color is white");
	}

}
