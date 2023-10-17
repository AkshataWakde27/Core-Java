package com.jsp.arrays;

import java.util.Scanner;

public class EvenOrOddNoInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n = sc.nextInt();
		System.out.println("enter the array elements");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + "number is even number");
			} else {
				System.out.println(a[i] + " number is odd number");
			}
		}
	}
}
