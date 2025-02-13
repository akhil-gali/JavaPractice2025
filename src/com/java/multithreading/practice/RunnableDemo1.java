package com.java.multithreading.practice;

public class RunnableDemo1 extends TestClass implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}
	}
	public void xxx() {
		System.out.println("inn XXX method");
	}
}
