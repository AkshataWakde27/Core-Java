package com.jsp.numbertheory;

import java.util.Scanner;

public class MaxDigitInNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();
		int maxDigit = MaxDigit(n);
		System.out.println("The maximum digit in the number is: " + maxDigit);

	}

	public static int MaxDigit(int n) {
		int max = 0;
		while (n > 0) {
			int d = n % 10;
			if (d > max) {
				max = d;
			}
			if (max == 9) {
				return max;
			}
			n = n / 10;
		}
		return max;
	}
}
