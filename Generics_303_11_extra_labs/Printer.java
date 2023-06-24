package com.perscholas.Generics_303_11_extra_labs;

public class Printer {

    public <T> Integer[] printArray(T array){
        System.out.println(array);
        return new Integer[0];
    }
}
