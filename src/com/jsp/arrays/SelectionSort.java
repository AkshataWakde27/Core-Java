package com.jsp.arrays;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = readArray();
		SelectionSort(a);
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

	public static void SelectionSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void displayArray(int[] a) {
		System.out.println("Merged Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
