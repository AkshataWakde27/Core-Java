package com.jsp.patterns;

import java.util.Scanner;

public class Program27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value =");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print((char)(96+j)+ " ");

			}
			System.out.println();

		}
	}
}

/*
Output 
Enter The Value=5
e d c b a 
d c b a 
c b a 
b a 
a 

*/
