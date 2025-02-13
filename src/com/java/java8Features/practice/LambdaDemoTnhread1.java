package com.java.java8Features.practice;

public class LambdaDemoTnhread1 implements Runnable {

		// TODO Auto-generated method stub
		FunctionalInterface1 fi1= (a, b)->{
			System.out.println(a+b);
			for(int i=0;i<=100; i++) {
				System.out.println(i);
			}
		};

		@Override
		public void run() {
			// TODO Auto-generated method stub
			fi1.add(10,20);
		}
		

	}

