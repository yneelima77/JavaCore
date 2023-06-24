package com.perscholas.LAB303_5_HashSetandTreeSet;

import java.util.Comparator;

public class TreeSet_cities_Comparator_Example4 implements Comparator<String> {
    //override compare method to compare two elements of the TreeSet
    @Override
    public int compare(String cities_one, String cities_two) {
        int val = cities_one.compareTo(cities_two);
        // sort elements in reverse order
        if (val > 0) {
            return -1;

        } else if (val < 0) {
            return 1;

        } else
            return 0;
    }
}
