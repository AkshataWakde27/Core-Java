package com.jsp.arrays;

import java.util.Scanner;

public class HappyNumbersInArray {
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
			boolean b = isHappy(a[i]);
			if (b == true) {
				count++;
			}
		}

		System.out.println(count + " Happy Numbers Are There In The Array");
	}

	public static boolean isHappy(int n) {
		while (n > 9) {
			n = squareDigit(n);
		}
		return n == 1 || n == 7;
	}

	public static int squareDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			int s = sum + d * d;
			n = n / 10;
		}
		return sum;
	}
}
