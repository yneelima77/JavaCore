package com.perscholas.GLAB303_11_6_HashMapTreeMapProcessing;

import java.util.HashMap;

public class ExampleOneHashMap {
    public static void main(String[] args) {
        //Remove HashMap Elements.
        HashMap<Integer, String> lan = new HashMap<>();
        lan.put(1, "Java");
        lan.put(2, "python");
        lan.put(3, "JavaScript");
        lan.put(4, "C Sharp");

        System.out.println("Languages HashMap " + lan);
        // remove element associated with key 2
        System.out.println("Removed Value " + lan.remove(2));
        System.out.println("Remove value at 4 "+lan.remove(4,"C Sharp"));
        System.out.println("updated hashmap " + lan);
    }
}
