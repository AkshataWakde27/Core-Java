package com.jsp.patterns;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char) (64 + i) + " ");
			}
			System.out.println();

		}
	}
}


/*
Output
Enter The Value=4
A A A A 
B B B B 
C C C C 
D D D D 
*/
