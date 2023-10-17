package com.jsp.patterns;

import java.util.Scanner;

public class Program52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


/*
Output 
Enter the value=5  
             1
           1 2 1
         1 2 3 2 1
       1 2 3 4 3 2 1
         1 2 3 2 1
           1 2 1
             1  
 */
