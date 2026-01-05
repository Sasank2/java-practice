package com.sasank.java2025.loops;

import java.util.Scanner;

public class StarLeftAlignedTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i<= num; i++) {
			
			for(int s = 1; s<=num - i; s++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
