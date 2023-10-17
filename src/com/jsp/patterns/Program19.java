package com.jsp.patterns;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=3
* * * 
* * 
* 

*/
