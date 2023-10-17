package com.jsp.patterns;

import java.util.Scanner;
import java.util.Scanner;

public class Program54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int k = n - i + 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(k + " ");
				if (j < i) {
					k++;
				} else {
					k--;
				}
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int k = n - i + 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(k + " ");
				if (j < i) {
					k++;
				} else {
					k--;
				}
			}
			System.out.println();
		}
	}
}

/*
Output 
Enter the value=5
             4
           3 4 3
         2 3 4 3 2
       1 2 3 4 3 2 1
         2 3 4 3 2
           3 4 3
             4

 */
