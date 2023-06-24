package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.TreeSet;

public class TreeSetExample_Comparator {
    public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new TreeSet_cities_Comparator_Example4());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}
