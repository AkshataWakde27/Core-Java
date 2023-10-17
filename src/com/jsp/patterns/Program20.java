package com.jsp.patterns;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/

