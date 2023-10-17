package com.jsp.patterns;

import java.util.Scanner;

public class Program34 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value =");
	        int n = sc.nextInt();

	        int st = 1;
	        int sp = n - 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= sp; j++) {
	                System.out.print("  ");
	            }
	            for (int j = 1; j <= st; j++) {
	                System.out.print(j+ " ");
	            }

	            sp--;
	            st++;
	            System.out.println();
	        }
	    }
	}


/*
Output
Enter the value=5
	    1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5
*/

