package com.jsp.numbertheory;

import java.security.PublicKey;
import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number (a):");
		int a = sc.nextInt();

		System.out.println("Enter the exponent (b):");
		int b = sc.nextInt();

		double result = pow(a, b);
		System.out.println(a + " raised to the power of " + b + " is " + result);
	}

	public static double pow(int a, int b) {
		double r = 1;
		boolean x = false;

		if (b < 0) {
			b = -b;
			x = true;
		}

		while (b > 0) {
			r = r * a;
			b--;
		}

		if (x == true) {
			return 1 / r;
		}
		return r;

	}
}
