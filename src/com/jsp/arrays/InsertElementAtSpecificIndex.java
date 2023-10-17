package com.jsp.arrays;

import java.util.Scanner;

public class InsertElementAtSpecificIndex {
	public static void main(String[] args) {
		int a[] = readArray();
		int b[] = readArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("At which index you have to insert the element : ");
		int index = sc.nextInt();
		System.out.println("Enter the value :");
		int value = sc.nextInt();
		a = insertAt(index, value, a);
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

	public static int[] insertAt(int index, int value, int a[]) {
		if (index < 0 || index > a.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		int b[] = new int[a.length + 1];
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
			b[index] = value;
		}

		for (int i = index; i < a.length; i++) {
			b[i + 1] = a[i];
		}
		return b;
	}

	public static void displayArray(int[] a) {
		System.out.println("Merged Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
