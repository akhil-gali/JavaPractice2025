package com.java.java8Features.practice;

public class LambdaDemoThreadTest {

	public static void main(String[] args) {
		LambdaDemoTnhread1 ld1 = new LambdaDemoTnhread1();
		LambdaDemoThread2 ld2 = new LambdaDemoThread2();
		Thread t2 = new Thread(ld2);
		Thread t1 = new Thread(ld1);
		t1.start();
		t2.start();

	}

}
