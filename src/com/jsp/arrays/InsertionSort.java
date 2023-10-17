package com.jsp.arrays;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = readArray();
		InsertionSort(a);
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

	public static int InsertionSort(int a[]) {
		for (int i = 1; i < a.length - 1; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;

		}
		return 0;
	}

	public static void displayArray(int[] a) {
		System.out.println("Merged Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
