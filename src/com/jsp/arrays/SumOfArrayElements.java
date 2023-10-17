package com.jsp.arrays;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements = ");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of elements = " + sum);
	}
}