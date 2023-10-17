package com.jsp.numbertheory;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();

		boolean b = isHappy(n);
		if (b == true) {
			System.out.println(n + " " + "Number Is Happy");
		}

		else {
			System.out.println(n + " " + "Number Is Not Happy");
		}
	}

	public static boolean isHappy(int n) {
		while (n > 9) {
			n = squareDigit(n);
		}
		return n == 1 || n == 7;
	}
//49
	public static int squareDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			int s = sum + d * d;
			n = n / 10;
		}
		return sum;
	}
}
