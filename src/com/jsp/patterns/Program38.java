package com.jsp.patterns;

import java.util.Scanner;

public class Program38 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value =");
        int n = sc.nextInt();

       
        int sp = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            sp++;
           
            System.out.println();
        }
    }
}


/*
Output
Enter the value=6
* * * * * * 
  * * * * * 
    * * * * 
      * * * 
        * * 
          *  
*/