package com.jsp.patterns;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("* ");
		}
	}

}


/*
Output
Enter The Value=3
* * *
*/
