package com.jsp.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = readArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key to search: ");
		int key = sc.nextInt();
		int result = binarySearch(a, key);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found in the array.");
		}
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

	public static int binarySearch(int a[], int key) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) { // Changed to a while loop
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				return mid; // Element found, return its index
			} else if (a[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1; // Element not found in the array
	}
}
