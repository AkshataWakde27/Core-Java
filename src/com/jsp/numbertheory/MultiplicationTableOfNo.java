package com.jsp.numbertheory;

import java.util.Scanner;

public class MultiplicationTableOfNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();

		MultiplicationTable(n);

	}

	public static void MultiplicationTable(int n) {
		System.out.println("The Multiplication Table Of Number Is :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}

	}
}
