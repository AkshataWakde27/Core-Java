package com.jsp.numbertheory;

import java.util.Scanner;

public class TwoDigitNoOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();

		boolean b = isTwoDigitNo(n);
		if (b == true) {
			System.out.println(n + " " + "Number Is Two-Digit");
		} else {
			System.out.println(n + " " + "Number Is Not Two-Digit");
		}
	}

	public static boolean isTwoDigitNo(int n) {
		return (n / 100 == 0 && n / 10 != 0);
	}

}
