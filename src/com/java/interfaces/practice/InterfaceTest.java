package com.java.interfaces.practice;

public abstract class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleAbstract cir = new Circle();
		cir.area(20);
		cir.draw();
		cir.fill();
		Rectangleabstract rect = new Rectangle();
		rect.area(20, 10);
		rect.draw();
		rect.fill();
		
		
				}
}
