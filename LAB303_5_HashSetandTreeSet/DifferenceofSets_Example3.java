package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.HashSet;

public class DifferenceofSets_Example3 {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        oddNumbers.removeAll(primeNumbers);
        System.out.println("Difference : " + oddNumbers);
        System.out.println("Difference : " + primeNumbers);
    }
}
