package com.java.interfaces.practice;

public abstract class CircleAbstract implements Shape, Size {

	@Override
	public void area(int r) {
		// TODO Auto-generated method stub
		System.out.println("Area is : " + 2 * 3.14 * r);

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing the circle");
	}
}
