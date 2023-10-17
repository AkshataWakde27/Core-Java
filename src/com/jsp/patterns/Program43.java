package com.jsp.patterns;

import java.util.Scanner;

public class Program43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int sp = n - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

				if (j < i) {
					System.out.print("* ");
				}
			}
			sp--;
			System.out.println();
		}
	}
}

/*
Output
Enter the value=5
        1 
      1 * 2 
    1 * 2 * 3 
  1 * 2 * 3 * 4 
1 * 2 * 3 * 4 * 5

*/
