package com.java.multithreading.practice;

public class ThreadClassDemo extends Thread{
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println(i);
			System.out.println();
		}
		
	}
}