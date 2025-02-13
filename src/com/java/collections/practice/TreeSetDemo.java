package com.java.collections.practice;

import java.util.*;

//treeset is sorted and no duplicates are allowed
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Dumbell");
		ts.add("Barbell");
		ts.add("Cable machine");
		ts.add("Weights");
		ts.add("Threadmill");
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		ts.descendingIterator();
	}

}
