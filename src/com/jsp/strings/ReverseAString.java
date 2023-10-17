package com.jsp.strings;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();

		String out = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			out = out + c;
		}
		System.out.println(out);

	}

}
