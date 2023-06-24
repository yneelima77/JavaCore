package com.perscholas.Generics_303_11_extra_labs;

import java.awt.print.PrinterException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainEntryPoint {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        for (int i = 0; i < intArray.length; i++) {
            myPrinter.printArray(intArray[i]);
        }
        for (int j = 0; j < stringArray.length; j++) {
            myPrinter.printArray(stringArray[j]);
        }
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
            //System.out.println("Method count=" + count);
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");

    }

}
