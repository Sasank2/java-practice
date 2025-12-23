package com.sasank.java2025.loops;

public class ReverseNumber {
	
	public int reverseNum(int n) {
		int reverseNumb = 0;
		while(n != 0) {
			int digit = n%10;
			reverseNumb = reverseNumb *10 + digit;
			n = n/10;
		}
		return reverseNumb;
	}

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		int result = rn.reverseNum(98765);
		System.out.println(result);
	}

}
