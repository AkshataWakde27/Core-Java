package com.jsp.patterns;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int k = n*n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();

		}
	}
}


/*
Output 
Enter The Value=3
9 8 7 
6 5 4 
3 2 1 
*/
