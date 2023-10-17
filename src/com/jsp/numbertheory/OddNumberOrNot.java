package com.jsp.numbertheory;

import java.util.Scanner;

public class OddNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();

		boolean b = isOdd(n);
		if (b == true) {
			System.out.println(n + " " + "Number is Odd");
		} else {
			System.out.println(n + " " + "Number is not Odd");
		}

	}

	public static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		}

		else {
			return false;
		}
	}
}
