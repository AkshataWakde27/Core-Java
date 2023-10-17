package com.jsp.patterns;

import java.util.Scanner;

public class Program36 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value =");
        int n = sc.nextInt();

        int st=n;
        int sp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >=st; j--) {
                System.out.print(j+ " ");
            }

            sp--;
            st--;
            System.out.println();
        }
    }
}


/*
Output
Enter the value=5
        5 
      5 4 
    5 4 3 
  5 4 3 2 
5 4 3 2 1
*/
