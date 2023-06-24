package com.perscholas.func_interface_mylabs_POC;

import java.util.function.Function;

public class FunctionJavaUtil {
    // Java Program to Illustrate Functional Interface
    // Via apply() method
    public static void main(String[] args) {
        // Function which takes in a number
        // and returns half of it

        //Function<Integer, Double> half = a -> a/2.0;
        Function<Double, Double> half = a -> a / 2.0;
        Double dblInput = 58.5;
        Double dd = half.apply(dblInput);

        System.out.println(dd);
    }

}

