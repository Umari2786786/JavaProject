package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] integerArray = {5, 8, 12, 3, 9};

        int sum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            sum += integerArray[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
