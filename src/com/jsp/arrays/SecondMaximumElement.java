package com.jsp.arrays;

import java.util.Scanner;

public class SecondMaximumElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array =");
		int n = sc.nextInt();
		System.out.println("Enter the array elements :");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

			if (a[i] < min) {
				min = a[i];
			}
		}

		if (min == max) {
			System.out.println("No Second Largest Element");
		}

		else {
			int max2 = min;
			System.out.println("The Second Maximum Element Is : ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max2 && a[i] < max) {
					max2 = a[i];
				}
			}
			System.out.println(max2);
		}

	}

}
