package com.jsp.numbertheory;

import java.util.Scanner;

public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number =");
		int n = sc.nextInt();

		String s = isDecToHexaDecimal(n);
		System.out.println("Conversion Of Decimal To HexaDecimal Number Is :" + " " + s);

	}
//5386
	public static String isDecToHexaDecimal(int n) {
		String s = " ";
		while (n > 0) {
			int d = n % 16;//10

			if (n < 10) {
				s = d + s;
			}

			else {
				s = (char) (55 + d) + s;
			}

			n = n / 16;//336
		}
		return s;
	}

}
