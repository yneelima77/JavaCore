package com.perscholas.practiceKBA303_14_LanbdaExpression;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;

public class Example1_printUsingLambda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
        Collections.addAll(names, firstName);
        // Print every item in the list using lambda expressions.
        names.forEach(n -> System.out.println(n));
    }

}
