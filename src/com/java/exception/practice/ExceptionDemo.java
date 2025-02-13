package com.java.exception.practice;

public class ExceptionDemo {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		// TODO Auto-generated method stub
		try{
			int result = n/m;
		System.out.println(result);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end of the program");

	}

}
