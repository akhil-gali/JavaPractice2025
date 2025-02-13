package com.java.collections.practice;

import java.util.*;
/*instead of arraylist object, if i write LInkedlist
the result would be same, but performance will increase,
ie, speed of insertion and deletion will increase*/

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();

		// LinkedList al = new LinkedList();

		al.add(100); // autoboxing added in java 5 version, see cmnts below
		al.add(200); // previously, we write like al.add(new Integer(200));
		al.add(300);
		al.add("akhil");
		al.add("priyanka");
		al.add(100.00);
		System.out.println(al);
		al.add(2, 250);
		System.out.println(al);
		al.set(2, 245);
		System.out.println(al);
		int k = 245;
		System.out.println(al.remove(Integer.valueOf(k)));
		System.out.println(al);
		System.out.println(al.remove(Double.valueOf(100.0)));
		System.out.println(al);
		int size = al.size();
		System.out.println("size = " + size);
	}

}

/*
 * converting the reference type to primitive type and vice versa automatically.
 * this feature is called as auto boxing and this feature is added from java 5
 * version.
 */
