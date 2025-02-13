package com.java.collections.practice;

import java.util.*;

// unordered and no duplicates allowed
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Dumbell");
		hs.add("Barbell");
		hs.add("cable machine");
		hs.add("weights");
		hs.add("threadmill");
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("After removal");
		hs.remove("weights");
		for (String s : hs) {
			System.out.println(s);
		}
		// hs.clear();// will clear the hashset

	}

}
