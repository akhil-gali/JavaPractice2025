package com.java.interfaces.practice;

public abstract class Rectangleabstract implements Size, Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing a rectangle");
		
	}

	@Override
	public void area(int l, int b) {
		System.out.println("Area is:  "+l*b );
		
	}

}
