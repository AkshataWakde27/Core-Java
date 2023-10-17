package com.jsp.numbertheory;

import java.security.PublicKey;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();
		int palindrome = Palindrome(n);
		if (palindrome == n) {
			System.out.println(palindrome + " " + "is palindrome");
		} else {
			System.out.println(palindrome + " " + "is not palindrome");
		}
	}

	public static int Palindrome(int n) {
		int r = 0;
		while (n != 0) {
			int d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		return r;

	}
}
