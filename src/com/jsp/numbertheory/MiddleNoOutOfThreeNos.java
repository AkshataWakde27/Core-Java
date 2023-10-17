package com.jsp.numbertheory;

import java.util.Scanner;

public class MiddleNoOutOfThreeNos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The First Number =");
		int num1 = sc.nextInt();

		System.out.println("Enter The Second Number =");
		int num2 = sc.nextInt();

		System.out.println("Enter The Third Number =");
		int num3 = sc.nextInt();

		int Middleno = MiddleNoOfThreeNos(num1, num2, num3);
		System.out.println("The Middle  Number Among The Three Numbers Is =" + " " + Middleno);
	}

	public static int MiddleNoOfThreeNos(int num1, int num2, int num3) {
		if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2) {
			return num1;
		}

		else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1) {
			return num2;
		}

		else {
			return num3;
		}
	}
}
