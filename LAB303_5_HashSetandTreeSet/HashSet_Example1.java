package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.HashSet;

public class HashSet_Example1 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: "+evenNumber);

        // Using addAll() method-adds all collection elements to the set
        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New Hashset: "+numbers);

    }
}
