package com.jsp.arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[] = readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key = ");
		int key = sc.nextInt();
		int index = linearsearch(a, key);
		if (index >= 0) {
			System.out.println(key + " " + "is present" + " " + "At" + " " + index + " " + "index");
		} else
			System.out.println(key + " " + "is not in array");
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

	public static int linearsearch(int a[], int key) {
//		for (int i = 0; i < a.length; i++)  If Same Element Is Present In Array
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
