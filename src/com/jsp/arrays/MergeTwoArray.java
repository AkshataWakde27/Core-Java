package com.jsp.arrays;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {

		int a[] = readArray();
		int b[] = readArray();
		int c[] = MergeArray(a, b);
		displayArray(c);
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

	public static int[] MergeArray(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];

		int j = 0;
		for (int i = 0; i < a.length; i++) {
			c[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {
			c[j] = b[i];
			j++;
		}
		return c;
	}

	public static void displayArray(int[] a) {
		System.out.println("Merged Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
