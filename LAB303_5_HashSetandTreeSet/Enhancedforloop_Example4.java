package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.HashSet;

public class Enhancedforloop_Example4 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        for(String fruit : hset){
            System.out.println("-----> "+fruit);
        }

    }
}
