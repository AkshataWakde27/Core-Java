package com.jsp.patterns;

import java.util.Scanner;

public class Program23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
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
3 4 
2 3 4 
1 2 3 4 

*/
