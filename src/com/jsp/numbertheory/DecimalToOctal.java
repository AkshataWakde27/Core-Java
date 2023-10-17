package com.jsp.numbertheory;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number =");
		int n = sc.nextInt();

		String s = isDecToOctal(n);
		System.out.println("Conversion Of Decimal To Octal Number Is :" + " " + s);

	}

	public static String isDecToOctal(int n) {
		String s = " ";
		while (n > 0) {
			int d = n % 8;
			s = s + d;
			n = n / 8;
		}
		return s;
	}

}
