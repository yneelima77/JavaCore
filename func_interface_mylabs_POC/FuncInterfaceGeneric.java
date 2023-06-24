package com.perscholas.func_interface_mylabs_POC;

import com.sun.jdi.IntegerValue;

public class FuncInterfaceGeneric {

    // WHAT YOU NEED TODO:
    //CODE The interface that operates on the generic type T.
    public static void main(String[] args) {
        // Declare a reference to the IValue functional interface
        // that will operate on the Float type

        IValue<Float> refIValue;
        // Set a lambda expression with reference to the type Float
        // that return the value of float type [empty braces means no arguments passed to the method]
        refIValue = () -> 3.1415f;

        // Invoke method GetValue(), which returns 3.1415f
        System.out.println(refIValue.GetValue());
    }
}
