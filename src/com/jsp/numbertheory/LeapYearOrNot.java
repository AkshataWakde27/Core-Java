
//Method 1:-
package com.jsp.numbertheory;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Day Number:");
		int day = scanner.nextInt();

		System.out.println("Enter the Month:");
		int month = scanner.nextInt();

		System.out.println("Enter the Year:");
		int year = scanner.nextInt();

		boolean isLeap = isLeapYear(day, month, year);

		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);

		if (isLeap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

	public static boolean isLeapYear(int day, int month, int year) {
		boolean isLeap = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

		if (month == 2) {
			if (isLeap==true) {
				return day >= 1 && day <= 29;
			} else {
				return day >= 1 && day <= 28;
			}
		}

		return isLeap;
	}
}

//Method 2
//public class LeapYearOrNot {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Year:");
//		int year = scanner.nextInt();
//
//		boolean b = isLeapYear(year);
//
//		if (b == true) {
//			System.out.println(year + " is a leap year.");
//		} else {
//			System.out.println(year + " is not a leap year.");
//		}
//	}
//
//	public static boolean isLeapYear(int year) {
//		boolean b = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
//
//		return b;
//
//	}
//}
