package com.jsp.numbertheory;

import java.util.Scanner;

public class PerfectNunber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();
		boolean b = isPerfect(n);
		if (b == true) {
			System.out.println(n + " " + "Number Is Perfect");
		} else {
			System.out.println(n + " " + "Number Is Not Perfect");
		}
	}

	public static boolean isPerfect(int n) {
		int sum = 0;
		int temp = n;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		return true;

	}
}
