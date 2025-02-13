package com.java.collections.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

//ordered and duplicates are not allowed

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Dumbell");
		lhs.add("Barbell");
		lhs.add("cable machine");
		lhs.add("weights");
		lhs.add("threadmill");
		for (String s : lhs) {
			System.out.println(s);
		}

	}

}
