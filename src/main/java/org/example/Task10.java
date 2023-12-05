package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        String[] stringsArray = {"Audi", "BMW", "Toyota", "Mercedes", "Nissan", "Audi", "Honda"};

        Map<String, Integer> stringMap = new HashMap<>();

        for (String str : stringsArray) {
            if (stringMap.containsKey(str)) {

                stringMap.put(str, stringMap.get(str) + 1);
            } else {

                stringMap.put(str, 1);
            }
        }

        System.out.println("Duplicate elements in the array:");

        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
