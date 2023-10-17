package com.jsp.numbertheory;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number =");
		int n = sc.nextInt();

		int OctToDec = OctalToDecimal(n);
		System.out.println("Conversion Of Octal To Decimal Number Is :" + " " + OctToDec);

	}

	public static int OctalToDecimal(int n) {
		int sum = 0;
		int base = 1;

		while (n > 0) {
			int d = n % 10;
			sum = sum + d;
			base = base * 8;
			n = n / 10;

		}
		return sum;
	}
}
