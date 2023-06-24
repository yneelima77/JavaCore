package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.TreeSet;

public class TreesetExampletwo_Remove {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
        // Using the remove() method
        boolean val1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + val1);

        // Using the removeAll() method
        boolean val2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + val2);
    }
}
