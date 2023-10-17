package com.jsp.numbertheory;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();

		if (isStrong(n)) {
			System.out.println(n + " " + "No is Strong");
		}

		else {
			System.out.println(n + " " + "No is not Strong");
		}

//	Without use of Scanner
//	int n=132;
//	boolean b=isStrong(n);
//	if(b==true) {
//		System.out.println(n + "Number is Strong");
//	}
//	
//	else {
//		System.out.println(n + "Number is not Strong");
//	}

	}

	public static boolean isStrong(int n) {
		int sum = 0;
		int temp = n;
		while (n > 0) {
			int d = n % 10;
			int f = fact(d);
			sum = sum + f;
			n = n / 10;
		}
		return sum == temp;
	}

	public static int fact(int n) {
		int f = 1;
		while (n > 1) {
			f = f * n;
			n--;
		}
		return f;

	}
}
