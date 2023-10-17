package com.jsp.numbertheory;

import java.util.Scanner;

public class AverageOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		System.out.println(sum(n));

//	Without use of Scanner
		int a = 5;
		int b = sum(a);
		double avg = b * 1.0 / a;
		System.out.println(avg);
	}

	public static int sum(int n) {
		int sum = 0;
		while (n >= 1) {
			sum = sum + n;
			n--;
		}
		return sum;
	}

}
