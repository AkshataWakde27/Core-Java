package com.jsp.patterns;

import java.util.Scanner;

public class Program32 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int st = n/2+1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			System.out.println();

			if (i <= n / 2) {
				st--;
			}

			else {
				st++;
			}

		}
	}
}

/*
Output 
Enter The Value=7
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 

 */
