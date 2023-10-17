package com.jsp.arrays;

import java.util.Scanner;

public class ByteArrayToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array = ");
		int n = sc.nextInt();
		byte b[] = new byte[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextByte();
		}

		String s = " ";
		for (int i = 0; i < b.length; i++) {
			s = s + (char) b[i];
		}
		System.out.println(s);

	}
}
