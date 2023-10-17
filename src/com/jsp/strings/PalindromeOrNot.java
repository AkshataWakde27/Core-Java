package com.jsp.strings;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();

		if (isPalindrome(s)) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Is Not Palindrome");
		}
	}

	public static boolean isPalindrome(String s) {
		int l = s.length() - 1;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(l)) {
				return false;
			}
			l--;
		}
		return true;
	}
}
