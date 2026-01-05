package com.sasank.java2025.loops;

public class IncreaseCounter {
	
	public int counter(int num[]) {
		int count = 0;
		for(int i =1; i < num.length; i++) {
			if(num[i] > num[i-1]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		IncreaseCounter ic = new IncreaseCounter();
		int num[] = {1,2,2,3,5};
		int count = ic.counter(num);
		System.out.println(count);

	}

}
