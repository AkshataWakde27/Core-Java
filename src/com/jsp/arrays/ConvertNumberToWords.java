package com.jsp.arrays;

import java.util.Scanner;

public class ConvertNumberToWords {

	public static void main(String[] args) {
		int a[] = readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount =");
		int n = sc.nextInt();
		NumToWords(n / 10000000, "crore");
		NumToWords(n / 100000 % 100, "lakh");
		NumToWords(n / 1000 % 100, "thousand");
		NumToWords(n / 100 % 10, "hundred");
		NumToWords(n % 100, " ");

	}

	public static int[] readArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static void NumToWords(int n, String s) {
		if (n <= 0) {
			return;
		}

		String ones[] = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twel", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String tens[] = { " ", " ", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		if (n < 20) {
			System.out.println(ones[n] + " ");
		}

		else {
			System.out.println(tens[n / 10] + " " + ones[n % 10] + " ");
			System.out.println(s + " ");
		}
	}

	public static void displayArray(int[] a) {
		System.out.println("Merged Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
