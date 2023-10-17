package com.jsp.numbertheory;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number =");
		int n = sc.nextInt();

		String s = isDecToBinary(n);
		System.out.println("Conversion Of Decimal To Binary Number Is :" + " " + s);

	}
//156
	public static String isDecToBinary(int n) {
		String s = " ";
		while (n > 0) {
			int d = n % 2;
			s = d + s;
			n = n / 2;
		}
		return s;
	}

}
