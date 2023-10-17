package com.jsp.numbertheory;

import java.util.Scanner;

public class ValidDateOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day :");
		int d = sc.nextInt();

		System.out.println("Enter the Month :");
		int m = sc.nextInt();

		System.out.println("Enter the Year :");
		int y = sc.nextInt();

		boolean b = isValidDate(d, m, y);
		if (b == true) {
			System.out.println(b + " " + "Date is Valid");
		}

		else {
			System.out.println(b + " " + "Date is not Valid");
		}
	}

	public static boolean isValidDate(int d, int m, int y) {
		if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1) {
			return false;
		}

		else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
			return false;
		}

		else if ((y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && m == 2 && d > 29) {
			return false;
		}

		else if (!(y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && m == 2 && d > 28) {
			return false;
		}

		else {
			return true;
		}

	}

}
