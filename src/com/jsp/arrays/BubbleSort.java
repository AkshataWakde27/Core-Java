package com.jsp.arrays;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		int a[] = readArray();
		BubbleSort(a);
		System.out.println("Array After Sorting");
		displayArray(a);
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

	public static void BubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			boolean x = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					x = false;
				}
			}
			if (x == true)
				return;
		}

	}

	public static void displayArray(int[] a) {
		System.out.println("Sorted Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
