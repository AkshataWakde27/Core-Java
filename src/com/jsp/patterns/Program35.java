package com.jsp.patterns;

import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value =");
        int n = sc.nextInt();

       
        int sp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+ " ");
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
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1
*/
