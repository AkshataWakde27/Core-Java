package com.jsp.strings;

import java.util.Scanner;

public class AnagramOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word :");
		String s1 = sc.nextLine();

		System.out.println("Enter the second word :");
		String s2 = sc.nextLine();

		if (isAnagram(s1, s2)) {
			System.out.println("Is Anagram");
		} else {
			System.out.println("Is Not Anagram");
		}
	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		int[] a = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			a[c - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			a[c - 'a']--;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
