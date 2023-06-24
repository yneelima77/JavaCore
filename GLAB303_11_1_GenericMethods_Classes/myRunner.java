package com.perscholas.GLAB303_11_1_GenericMethods_Classes;

public class myRunner {
    public static void main(String[] args) {

        System.out.println("Generic Method Example");
        GenericMethodExample gObj = new GenericMethodExample();
        gObj.GenericMethod("Per Scholas");
        gObj.GenericMethod(20);
        gObj.GenericMethod(23.91);
        gObj.GenericMethod(true);
        gObj.GenericMethod('G');
        System.out.println();

        System.out.println("GenericClass Multiple DataTypes Example");
        // initialize generic class
        // with String and Integer data
        GMultipleDatatype<Integer, String> gmObj = new GMultipleDatatype<>(1234, "Per Scholas");
        System.out.println(gmObj.getValue1());
        System.out.println(gmObj.getValue2());
        // initialize generic class
        // with String and String data
        GMultipleDatatype<String, String> gmObj2 = new GMultipleDatatype<>("Per Schola", "non profit");
        System.out.println(gmObj2.getValue1());
        System.out.println(gmObj2.getValue2());



    }
}
