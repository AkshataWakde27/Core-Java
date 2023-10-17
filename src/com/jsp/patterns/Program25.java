package com.jsp.patterns;

import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j+ " ");

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=5
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1

*/
