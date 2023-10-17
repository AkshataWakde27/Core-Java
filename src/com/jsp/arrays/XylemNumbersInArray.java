package com.jsp.arrays;

import java.util.Scanner;

public class XylemNumbersInArray {
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
			boolean b = isXylem(a[i]);
			if (b == true) {
				count++;
			}
		}

		System.out.println(count + " Xylem Numbers Are There In The Array");
	}

	public static boolean isXylem(int n) {
		int esum = n % 10;
		n = n / 10;
		int msum = 0;
		while (n > 0) {
			int d = n % 10;
			int m = msum + d;
			n = n / 10;
		}
		esum = esum + n;
		return msum == esum;
	}
}
