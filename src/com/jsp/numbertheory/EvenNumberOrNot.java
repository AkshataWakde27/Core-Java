package com.jsp.numbertheory;

import java.util.Scanner;

public class EvenNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();

		boolean b = isEven(n);
		if (b == true) {
			System.out.println(n + " " + "Number is Even");
		} else {
			System.out.println(n + " " + "Number is not Even");
		}

	}

	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}

		else {
			return false;
		}
	}
}
