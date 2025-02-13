package com.java.multithreading.practice;

import java.util.Iterator;

public class ThreadClassDemo2 extends Thread{
	@Override
	public void run() {
	for (int i = 100; i >=0; i--) {
		System.out.println(i);
		}
	}

}
