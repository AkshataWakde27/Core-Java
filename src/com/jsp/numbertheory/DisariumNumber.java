package com.jsp.numbertheory;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int n = sc.nextInt();

		boolean b = isDisarium(n);
		if (b == true) {
			System.out.println(n + " " + "Number Is Disarium");
		} else {
			System.out.println(n + " " + "Number Is Not Disarium");
		}
	}
//175
	public static boolean isDisarium(int n) {
		int sum = 0;
		int temp = n;
		int c = CountDigits(n);

		while (n != 0) {
			int d = n % 10;
			double q = pow(d, c);
			c--;
			sum = (int) (sum + q);
			n = n / 10;
		}
		return sum == temp;

	}

	public static int pow(int a, int b) {
		int r = 1;
		while (b > 0) {
			r = r * a;
			b--;
		}
		return (int) r;
	}

	public static int CountDigits(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
