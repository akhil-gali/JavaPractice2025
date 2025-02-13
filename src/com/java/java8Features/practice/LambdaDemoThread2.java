package com.java.java8Features.practice;

import java.util.Iterator;

public class LambdaDemoThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		fi2.loopExample();
	}
	FunctionalInterface2 fi2 = ()->{
		for(int i=100;i>=0;i--) {
			System.out.println(i);
		}
	};
	

}
