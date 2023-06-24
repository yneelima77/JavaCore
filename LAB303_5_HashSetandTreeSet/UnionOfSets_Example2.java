package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.HashSet;

public class UnionOfSets_Example2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> Numbers = new HashSet<>();
        Numbers.add(3);
        Numbers.add(5);
        System.out.println("HashSet2: " + Numbers);

        // Union of two sets
        evenNumbers.addAll(Numbers);
        System.out.println("Union of sets: "+evenNumbers);
    }
}
