package com.perscholas.GLAB303_11_4_LinkedlistProcessing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListsortExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        //Unsorted
        System.out.println(linkedList);
        //1. Sort the list
        Collections.sort(linkedList);
        //print Sorted
        System.out.println(linkedList);
        //2. Custom sorting
        Collections.sort(linkedList, Comparator.reverseOrder());
        //print Custom sorted
        System.out.println(linkedList);

    }
}
