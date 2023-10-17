package com.jsp.patterns;

import java.util.Scanner;

public class Program28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int k = 1;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(k + " ");
				k++;

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15   
 
 */
