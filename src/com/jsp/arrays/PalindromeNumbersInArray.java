package com.jsp.arrays;

import java.util.Scanner;

public class PalindromeNumbersInArray {

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
			boolean isPalin = isPalindrome(a[i]);
			if (isPalin) {
				count++;
			}
		}

		System.out.println(count + " Palindrome Numbers Are There In The Array");
	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return temp == rev;
	}
}