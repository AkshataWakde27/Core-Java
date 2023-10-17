package com.jsp.patterns;

import java.util.Scanner;

public class Program22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j+ " ");

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=4
4 
4 3 
4 3 2 
4 3 2 1 

*/


