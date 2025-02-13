package com.java.multithreading.practice;

public class ThreadClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClassDemo td1= new ThreadClassDemo();
		ThreadClassDemo2 td2= new ThreadClassDemo2();
		td1.start();
		td2.start();

	}

}
