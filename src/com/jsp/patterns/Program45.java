package com.jsp.patterns;

import java.util.Scanner;

public class Program45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int st = n;
		int sp = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			System.out.println();

			if (i <= n / 2) {
				st = st - 2;
				sp++;
			} else {
				st = st + 2;
				sp--;
			}
		}
	}
}


/*
Output
Enter the value=5
* * * * * 
  * * * 
    * 
  * * * 
* * * * * 
     
*/