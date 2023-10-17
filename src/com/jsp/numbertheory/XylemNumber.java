package com.jsp.numbertheory;

import java.util.Scanner;

public class XylemNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();

		boolean b = isXylem(n);
		if (b == true) {
			System.out.println(n + "Number Is Xylem");
		} else {
			System.out.println(n + "Number Is Not Xylem");
		}

	}
//1234
	public static boolean isXylem(int n) {
		int esum = n % 10;
		n = n / 10;
		int msum = 0;
		while (n > 0) {
			int d = n % 10;
			int m = msum + d;
			n = n / 10;
			System.out.println(n);
		}
		esum = esum + n;
		return msum == esum;
	}
}
