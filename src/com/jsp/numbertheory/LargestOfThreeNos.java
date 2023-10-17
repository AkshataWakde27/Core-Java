package com.jsp.numbertheory;

import java.util.Scanner;

public class LargestOfThreeNos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The First Number =");
		int num1 = sc.nextInt();

		System.out.println("Enter The Second Number =");
		int num2 = sc.nextInt();

		System.out.println("Enter The Third Number =");
		int num3 = sc.nextInt();

		int largestno = LargestOfThreeNos(num1, num2, num3);
		System.out.println("The Largest Number Among The Three Number Is =" + " " + largestno);

	}

	public static int LargestOfThreeNos(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		}

		else if (num2 > num3) {
			return num2;
		}

		else {
			return num3;
		}
	}
}
