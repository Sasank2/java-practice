package com.sasank.java2025.loops;

public class FrequencyDemo {

    public static int countFrequency(int[] numbers, int target) {
        int frequency = 0;

        for (int n : numbers) {
            if (n == target) {
                frequency++;
            }
        }

        return frequency;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 6, 7, 4, 8, 4, 3};
        int target = 3;

        int result = countFrequency(numbers, target);

        System.out.println("Frequency of number in the list = " + result);
    }
}
