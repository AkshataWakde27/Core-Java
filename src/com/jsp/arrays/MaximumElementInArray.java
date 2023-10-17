package com.jsp.arrays;

import java.util.Scanner;

public class MaximumElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of an array =");
		int n = sc.nextInt();
		System.out.println("enter the array elements :");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(maxElement(a));
	}

	public static int maxElement(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		return max;
	}

}
