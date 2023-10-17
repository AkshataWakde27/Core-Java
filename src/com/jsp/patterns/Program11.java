package com.jsp.patterns;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >=1; i--) {
			for (int j = n; j >=1; j--) {
				System.out.print((char)(64+i) + " ");
			}
			System.out.println();

		}
	}
}

/*
Output
Enter The Value=4
D D D D 
C C C C 
B B B B 
A A A A
*/



