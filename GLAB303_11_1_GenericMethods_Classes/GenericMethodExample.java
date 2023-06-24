package com.perscholas.GLAB303_11_1_GenericMethods_Classes;

public class GenericMethodExample {
    public <T> void GenericMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
