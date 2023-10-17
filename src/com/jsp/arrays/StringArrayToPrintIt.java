package com.jsp.arrays;

import java.util.Scanner;

public class StringArrayToPrintIt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array = ");
		int n = sc.nextInt();
		String s[] = new String[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}

	}
}
