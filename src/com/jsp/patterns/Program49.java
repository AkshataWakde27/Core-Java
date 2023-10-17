package com.jsp.patterns;

import java.util.Scanner;

public class Program49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		int sp = n - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			int k = n - i;
			for (int j = 1; j <= i * 2 - 1; j++) {

				if (j <= i) {
					System.out.print(++k + " ");
				}

				else {
					System.out.print(--k + " ");
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
        5 
      4 5 4 
    3 4 5 4 3 
  2 3 4 5 4 3 2 
1 2 3 4 5 4 3 2 1 
          
*/