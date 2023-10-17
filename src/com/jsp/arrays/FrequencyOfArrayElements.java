package com.jsp.arrays;

import java.util.Scanner;

public class FrequencyOfArrayElements {

	public static void main(String[] args) {
		int a[] = readArray();
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		int b[] = new int[max + 1];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				System.out.println(i + " " + "=" + " " + b[i] + " " + "times");
			}
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

}
