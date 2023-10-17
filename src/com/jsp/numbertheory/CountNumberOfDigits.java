package com.jsp.numbertheory;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		System.out.println("The Count Of Digits Is =" + " " + CountDigits(n));

	}

	public static int CountDigits(int n) {
		int count = 0;
		int temp = n;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
