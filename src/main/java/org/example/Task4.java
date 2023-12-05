package org.example;

public class Task4 {public static void main(String[] args) {
    int[][] numbers = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
    };
    int sumEven = 0;
    int sumOdd = 0;
    for (int[] row : numbers) {
        for (int num : row) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
    }
    System.out.println("Sum of even numbers in the array: " + sumEven);
    System.out.println("Sum of odd numbers in the array: " + sumOdd);
}
}
