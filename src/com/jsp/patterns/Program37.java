package com.jsp.patterns;

import java.util.Scanner;

public class Program37 {
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
            for (int j = st; j <=n; j++) {
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
      4 5 
    3 4 5 
  2 3 4 5 
1 2 3 4 5 
*/
