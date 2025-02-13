package com.java.collections.practice;

import java.util.*;

//generics has been intrduced to java to make 
// collection of similar dta type. ie, if you want a collection to have
//elements of same data type, you should make use of generics,
// how do we use Generics..?
// by placing the reference data type in "<>" 
//where we create the object of collection refer the below program

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		for (int i : ll) { // this is enhanced for loop which iterates through
							// all the elements of the collection (ll)
			System.out.println(i);
		}

	}

}
