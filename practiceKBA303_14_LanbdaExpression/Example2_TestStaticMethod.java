package com.perscholas.practiceKBA303_14_LanbdaExpression;

public class Example2_TestStaticMethod implements Example2_StaticMethods {
    /* It's not possible to override static methods, it has to be either public or default
    * we can overload the static methods in sub classes and then call the static methods with classname.methodName in main*/
    public static void main(String[] args) {
        Example2_TestStaticMethod ET = new Example2_TestStaticMethod();
        ET.methodTwo();
        Example2_TestStaticMethod.methodOne();
    }
    @Override
    public void methodTwo() {
        System.out.println("M");
    }

    //overloaded static method
    public static void methodOne() {
        System.out.println("m");
    }
}
