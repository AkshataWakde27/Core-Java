package com.jsp.numbertheory;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number =");
		int n = sc.nextInt();

		int BinToDec = BinaryToDecimal(n);
		System.out.println("Conversion Of Binary To Decimal Number Is :" + " " + BinToDec);

	}

	public static int BinaryToDecimal(int n) {
		int sum = 0;
		int base = 1;
//10101 = 21
		while (n > 0) {
			int d = n % 10; 
            sum = sum + (d * base); //21
			base = base * 2;//32
			n = n / 10;

		}
		return sum;
	}
}
