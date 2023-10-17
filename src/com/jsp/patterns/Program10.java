package com.jsp.patterns;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <=n; i++) {
			for (int j = n; j >=1; j--) {
				System.out.print((char)(64+j) + " ");
			}
			System.out.println();

		}
	}
}

/*
Output
Enter The Value=3
C B A 
C B A 
C B A  
*/


