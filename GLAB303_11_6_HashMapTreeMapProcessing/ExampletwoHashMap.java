package com.perscholas.GLAB303_11_6_HashMapTreeMapProcessing;

import java.util.HashMap;

public class ExampletwoHashMap {
    public static void main(String[] args) {
        //Create Hashmap and Remove HashMap Elements
        HashMap<String, String> newHashMap = new HashMap<>();
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");

        System.out.println("Original map contains:" + newHashMap);
        //getting size of Hashmap
        System.out.println("Size of hashmap: " + newHashMap.size());

        //copy contains of one Hashmap to another
        HashMap<String, String> updatedHashMap = new HashMap<>();
        updatedHashMap.putAll(newHashMap);
        System.out.println("copied hashmap: " + updatedHashMap);

        //Removal of null key
        String nulval = updatedHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nulval);
        System.out.println("copyHashMap after removing null key = " + updatedHashMap);
        System.out.println("Size of copyHashMap is:" + updatedHashMap.size());

    }
}
