package com.perscholas.GLAB303_11_2_ArrayListandMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowsIterator = tvShows.iterator();
        while (tvShowsIterator.hasNext()){
            System.out.println(tvShowsIterator.next());
        }
        System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
        //tvShowsIterator = tvShows.iterator();
        tvShowsIterator.forEachRemaining(tvShow ->{
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String shows: tvShows) {
            System.out.println(shows);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i =0 ;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
        System.out.println("\n=== Iterate iterator ===");
        ListIterator iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");
        System.out.println("\n====== Iterate using while loop=======");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
