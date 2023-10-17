package com.jsp.patterns;

import java.util.Scanner;

public class Program51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int sp = 0;

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			int k = 0;
			for (int j = 1; j <= i * 2 - 1; j++) {

				if (j <= i) {
					System.out.print(++k + " ");
				}

				else {
					System.out.print(--k + " ");
				}
			}
			sp++;
			System.out.println();
		}
	}
}

/*
Output
Enter the value=5
1 2 3 4 5 4 3 2 1 
  1 2 3 4 3 2 1 
    1 2 3 2 1 
      1 2 1 
        1 
*/
