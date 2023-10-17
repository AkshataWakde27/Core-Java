package com.jsp.numbertheory;

import java.util.Scanner;

public class SumOfDigitsOfNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();

		int sumOfDigits = Sum(n);
		System.out.println("The Sum Of Digits Of Number Is =" + " " + Sum(n));

	}

	public static int Sum(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;

		}
		return sum;
	}
}
