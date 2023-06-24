package com.perscholas.practiceKBA303_14_LanbdaExpression;

public class Example5and6_TestInterface {
    public static void main(String[] args) {
        //Use lambdas expressions to add the two values together.
        Example5_AddTwoNumbersInterface example5AddInterface = (int a, int b)-> a + b;
        System.out.println(example5AddInterface.add(10, 2));

        Example5_AddTwoNumbersInterface example5SubTwoNum = (int a, int b)-> a- b;
        System.out.println(example5SubTwoNum.add(10, 2));
    }
}
