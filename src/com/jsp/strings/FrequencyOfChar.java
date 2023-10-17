package com.jsp.strings;

import java.util.Scanner;

public class FrequencyOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();

		int[] freq = new int[256];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[c]++;
		}

		for (int i = 0; i < 256; i++) {
			if (freq[i] != 0) {
				System.out.println((char) i + " = " + freq[i]);
			}
		}
	}
}