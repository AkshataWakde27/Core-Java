package com.jsp.arrays;

import java.util.Scanner;

public class MergeZigZag {
	public static void main(String[] args) {

		int a[] = readArray();
		int b[] = readArray();
		int c[] = MergeZigZagArray(a, b);
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

	public static int[] MergeZigZagArray(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		int c[] = new int[a.length + b.length];

		int i = 0;
		int j = 0;

		while (i < n) {
			c[j] = a[i];
			j++;

			c[j] = b[i];
			j++;
			i++;
		}

		while (i < a.length) {
			c[j] = a[i];
			i++;
			j++;
		}

		while (i < b.length) {
			c[j] = b[i];
			i++;
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
