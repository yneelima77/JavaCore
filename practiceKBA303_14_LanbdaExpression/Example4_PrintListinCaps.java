package com.perscholas.practiceKBA303_14_LanbdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Example4_PrintListinCaps {
    // Using any of the three different forms of a  lambda expression list above print every item in the list in capital letters.

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
        Collections.addAll(names, firstName);
        names.forEach((n)-> System.out.println(n.toUpperCase()));

    }
}
