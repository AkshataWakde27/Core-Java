package com.jsp.arrays;

import java.util.Scanner;

public class PosAndNegNosInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The length of array:");
		int n = scanner.nextInt();

		System.out.println("enter the array elements");
		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		int pcount = 0;
		int ncount = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				pcount++;
			} else {
				ncount++;
			}
		}

		System.out.println("The No Of Positive Numbers In an Array is :" + " " + pcount);
		System.out.println("The No Of Negative Numbers In an Array is :" + " " + ncount);
	}
}
