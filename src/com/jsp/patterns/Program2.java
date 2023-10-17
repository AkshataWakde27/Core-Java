package com.jsp.patterns;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

}


/*
Output
Enter The Value=5
1 2 3 4 5
*/
