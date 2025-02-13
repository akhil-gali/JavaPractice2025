package com.java.collections.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class LInkedListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL=new LinkedList();
		Scanner sc = new Scanner(System.in);
		int i;
		do {System.out.println("1. Add element at last\r\n"
				+ "2. Add element at first\r\n"
				+ "3. Add element at given index\r\n"
				+ "4. Update the element at given index\r\n"
				+ "5. Delete the first element\r\n"
				+ "6. Delete the last element\r\n"
				+ "7. Delete the given element\r\n"
				+ "8. Delete the element at given index\r\n"
				+ "9. Display the elements\r\n"
				+ "10. Exit");
			 i = sc.nextInt();
			 switch (i) {
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				break;
			}
			case 9: {
				break;
			}
			case 10: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
		} while (i!=10);

	}

}
