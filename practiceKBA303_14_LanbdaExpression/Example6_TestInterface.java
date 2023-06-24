package com.perscholas.practiceKBA303_14_LanbdaExpression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example6_TestInterface {
    public static void main(String[] args) {
        MyNumber number1 = (int n) -> n;
        MyNumber number2 = (int n) -> n;
        System.out.println((number1.showNumber(10)));
        System.out.println((number2.showNumber(12)));

       /* Set<String> vowelsSet = new HashSet<>();
        // add example
        vowelsSet.add("a");
        vowelsSet.add("e");
        vowelsSet.add("i");
        vowelsSet.add("o");
        vowelsSet.add("u");

        //convert Set to Array
        String[] strArray = vowelsSet.toArray(new String[vowelsSet.size()]);
        System.out.println(Arrays.toString(strArray));*/


    }

}
