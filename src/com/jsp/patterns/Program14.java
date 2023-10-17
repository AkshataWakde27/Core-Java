package com.jsp.patterns;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();

		}
	}
}


/*
Output 
Enter The Value=3
1 2 3 
4 5 6 
7 8 9  
*/
