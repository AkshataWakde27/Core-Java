package com.jsp.patterns;

import java.util.Scanner;

public class Program42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int st = n * 2 - 1;
		int sp = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}

			st = st - 2;
			sp++;
			System.out.println();
		}
	}
}

/*
Output
Enter the value=5

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *
*/