package com.perscholas.GLAB303_11_6_HashMapTreeMapProcessing;

import java.util.TreeMap;

public class exampleTreemapOne {
    //Remove TeeMap Elements
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int val = numbers.remove("Three");
        System.out.println("Removed value: " + val);

        // remove method with two parameters
        boolean value = numbers.remove("Two", 2);
        System.out.println("Is the entry {Two=2} removed? " + value);
        System.out.println("Updated TreeMap: " + numbers);
    }
}
