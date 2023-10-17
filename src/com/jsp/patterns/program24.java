package com.jsp.patterns;

import java.util.Scanner;

public class program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j+ " ");

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=5
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

*/

