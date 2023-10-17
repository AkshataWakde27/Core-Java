package com.jsp.arrays;

import java.util.Scanner;

public class PerfectNumbersInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array =");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean b = isPerfect(a[i]);
			if (b == true) {
				count++;
			}
		}

		System.out.println(count + " Perfect Numbers Are There In The Array");
	}

	public static boolean isPerfect(int n) {
		int sum = 0;
		int temp = n;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		return true;

	}
}
