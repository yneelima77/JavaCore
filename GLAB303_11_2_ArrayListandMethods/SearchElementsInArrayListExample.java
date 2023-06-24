package com.perscholas.GLAB303_11_2_ArrayListandMethods;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain Bob? : " + names.contains("Bob"));
        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("index of \"Steve\": " + names.indexOf("Steve"));
        System.out.println("index of \"Mark\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastindex of \"John\": " + names.lastIndexOf("John"));
        System.out.println("lastindex of \"Bill\": " + names.lastIndexOf("Bill"));
    }
}
