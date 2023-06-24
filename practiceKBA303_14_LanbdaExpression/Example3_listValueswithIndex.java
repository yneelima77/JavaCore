package com.perscholas.practiceKBA303_14_LanbdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Example3_listValueswithIndex {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
        Collections.addAll(names, firstName);
        /* print every item in the list with their index.
        Hint you can use the index.of method from Class ArrayList.*/
        names.forEach((n) -> System.out.println(names.indexOf(n)+" "+n));
    }
}
