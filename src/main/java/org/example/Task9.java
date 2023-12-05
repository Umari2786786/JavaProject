package org.example;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 3, 15, 9, 2};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secondMax = firstMax;
                firstMax = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != firstMax) {
                secondMax = numbers[i];
            }
        }
        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second largest number in the array: " + secondMax);
        } else {
            System.out.println("There is no second largest number in the array.");
        }
    }
}
