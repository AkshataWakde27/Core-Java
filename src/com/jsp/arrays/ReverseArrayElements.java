package com.jsp.arrays;

import java.util.Scanner;

public class ReverseArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array =");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		reverseArray(a);

		// Print the reversed array
		System.out.println("Reversed Array Elements:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void reverseArray(int a[]) {
		System.out.println("Reverse The Array Elements :");

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
	}
}