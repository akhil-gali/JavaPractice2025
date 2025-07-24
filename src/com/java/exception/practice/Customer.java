package com.java.exception.practice;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		int age;
		System.out.println("Please enter the age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		SetCustomerAge setCustomerAge = new SetCustomerAge();
		try {
			setCustomerAge.setAge(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
			//printing error
		}

	}

}

class SetCustomerAge {
	int age;

	void setAge(int age) throws AgeException {
		if (age >= 18 && age <= 60) {
			this.age = age;
			System.out.println("Age set to: " + age);
		} else {
			throw new AgeException("age should be between 18 and 60 ");
		}
	}
}
