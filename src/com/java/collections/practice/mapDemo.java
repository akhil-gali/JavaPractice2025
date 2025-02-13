package com.java.collections.practice;

import java.util.*;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Akhil", 5600);
		hm.put("Harika", 7600);
		hm.put("Chakri", 9000);
		hm.put("priyanka", 4500);
		System.out.println(hm);
		Map<String, Integer> lhm= new LinkedHashMap<String, Integer>();
		lhm.put("Akhil", 5600);
		lhm.put("Harika", 7600);
		lhm.put("Chakri", 9000);
		lhm.put("priyanka", 4500);
		System.out.println(lhm);
		TreeMap<String, Integer> tm= new TreeMap<String, Integer>();
		tm.put("Akhil", 5600);
		tm.put("Harika", 7600);
		tm.put("Chakri", 9000);
		tm.put("priyanka", 4500);
		System.out.println(tm);
		System.out.println(tm.descendingMap());
		
		}

}
