package com.java.collections.practice;

import java.util.*;

public class RemoveDuplicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<Integer> numbers = new ArrayList<Integer>(); numbers.add(1234);
		 * numbers.add(1234); numbers.add(4567); numbers.add(4567); numbers.add(1098);
		 * numbers.add(1234); numbers.add(1098); numbers.add(6784);
		 */
		List<Integer> numbers = List.of(1234, 1234, 4567, 4567, 1098, 1234, 1098, 6784);
		//collection factory method
		// this feature is added in java 9 version
		// we can write the list all at once
		// numbers.add(7859); // throws error as the above list is immutable
		System.out.println(numbers);
		Set<Integer> uniqueNumbers = new TreeSet<Integer>();
		uniqueNumbers.addAll(numbers);
		System.out.println(uniqueNumbers);

	}
}
