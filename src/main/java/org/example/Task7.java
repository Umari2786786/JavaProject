package org.example;

public class Task7 {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0, secondTerm = 1;

        System.out.println("First " + n + " numbers in Fibonacci series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
