package com.java.exception.practice;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n= Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);
			int result=n/m;
			System.out.println(result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("arguments passed should be a number");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("please peovide the numbers");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("number is getting divided by zero");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("end of the program");

	}

}
