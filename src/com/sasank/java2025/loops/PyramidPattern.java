package com.sasank.java2025.loops;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		for(int i =1; i <=num; i++) {
			for(int s = 1; s <= num - i; s++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i - 1; j++) {
				System.out.print("*");
			}
			for(int s1 = 1; s1 <= num - i; s1++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
