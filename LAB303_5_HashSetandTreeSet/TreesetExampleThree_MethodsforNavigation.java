package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.TreeSet;

public class TreesetExampleThree_MethodsforNavigation {
    public static void main(String[] args) {
        /*Since the TreeSet class implements NavigableSet,
        it provides various methods to navigate over the elements of the TreeSet.*/

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        System.out.println("First Number: "+numbers.first());
        // Using the last() method
        System.out.println("Last Number: "+numbers.last());
    }

}
