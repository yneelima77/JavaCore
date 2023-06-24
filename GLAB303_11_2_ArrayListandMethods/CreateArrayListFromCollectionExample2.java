package com.perscholas.GLAB303_11_2_ArrayListandMethods;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample2 {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);
        // Retrieve the element at a given index

        System.out.println("Best Company: " + topCompanies.get(0));
        System.out.println("Second Best Company: " + topCompanies.get(1));
        System.out.println("Third Best Company: " + topCompanies.get(2));
        System.out.println("Last Company in the list:" + topCompanies.get(4));

        // Modify the element at a given index
        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list: "+topCompanies);

    }
}
