package com.perscholas.GLAB303_11_2_ArrayListandMethods;

import java.util.ArrayList;

public class CreateArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);
        // Adding an element at a particular index in an ArrayList
        animals.add(2,"Elephant");
        System.out.println(animals);
    }
}
