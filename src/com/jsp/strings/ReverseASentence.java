package com.jsp.strings;

import java.util.Scanner;

public class ReverseASentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();

		String[] arr = s.split(" ");
		reverseArray(arr);
		String out = "";

		for (int i = 0; i < arr.length; i++) {
			out = out + arr[i] + " ";
		}
		System.out.println(out);

	}

	public static void reverseArray(String[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			String temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}
}
