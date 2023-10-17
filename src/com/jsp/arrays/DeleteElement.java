package com.jsp.arrays;

import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		int a[] = readArray();
		int b[] = readArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("At which index you have to delete the element : ");
		int index = sc.nextInt();
		a = deleteAt(index, a);
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

	public static int[] deleteAt(int index, int a[]) {
		if (index < 0 || index > a.length - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}

		int b[] = new int[a.length - 1];
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}

		for (int i = index + 1; i < a.length; i++) {
			b[i - 1] = a[i];
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
