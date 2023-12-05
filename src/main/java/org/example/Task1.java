package org.example;

public class Task1 {
    public static void main(String[] args) {
                double[] weeklyTemperatures = {22, 24, 25, 20, 23, 19, 21};
                double maxTemperature = weeklyTemperatures[0];
                double minTemperature = weeklyTemperatures[0];
                for (int i = 1; i < weeklyTemperatures.length; i++) {
                    if (weeklyTemperatures[i] > maxTemperature) {
                        maxTemperature = weeklyTemperatures[i];
                    }
                    if (weeklyTemperatures[i] < minTemperature) {
                        minTemperature = weeklyTemperatures[i];
                    }
                }
                System.out.println("The highest temperature is: " + maxTemperature + " degrees Celsius");
                System.out.println("The lowest temperature is: " + minTemperature + " degrees Celsius");
            }
        }

