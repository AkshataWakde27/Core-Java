package com.jsp.patterns;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=1; j--) {
				System.out.print( j + " ");
			}
			System.out.println();

		}
	}
}

/*
Output
Enter The Value=3
4 3 2 1 
4 3 2 1 
4 3 2 1 
4 3 2 1 
*/
