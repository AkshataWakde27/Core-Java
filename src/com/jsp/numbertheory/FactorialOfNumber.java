package com.jsp.numbertheory;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();

		int factorialOfNo = factorial(n);
		System.out.println("The Factorial Of Number Is =" + " " + factorial(n));

	}

	public static int factorial(int n) {
		int fact = 1;
		while (n > 1) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
}
