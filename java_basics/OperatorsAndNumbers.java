package com.perscholas.java_basics;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        leftShift(2);
        leftShift(9);
        leftShift(17);
        leftShift(88);

        rightShift(150);
        rightShift(225);
        rightShift(1555);
        rightShift(32456);

        bitwiseAnd(7, 17);
        bitwiseAnd(5, 10);

        bitwiseOr(7, 17);

        postfix_Increment(10);
        Unary_Operators(5);
        postfix_prefix(5, 8);


    }

    public static void leftShift(int x){
        System.out.println("Binary form of "+ x +" before left shift: "+Integer.toBinaryString(x));
        x = x<<1;
        //for x=2 binary string 100 and x=4 after left shift by 1
        System.out.println("Binary form after left shift: "+ Integer.toBinaryString(x));
        System.out.println("decimal value of after shift: "+ x +'\n');
    }

    public static void rightShift(int x){
        System.out.println("Binary form of "+ x +" before right shift: "+Integer.toBinaryString(x));
        x = x>>2;
        //for x=150 binary string 10010110 and x=37 after right shift by 2
        System.out.println("Binary form after right shift: "+ Integer.toBinaryString(x));
        System.out.println("decimal value of after shift: "+ x +'\n');
    }

    public static void bitwiseAnd(int x, int y){
        //111 for 7 & 10001 for 17. after comparison 1 will remain and decimal value is 1 and binary form is 1.
        int z =  x & y;
        System.out.println("decimal value is: "+z);
        System.out.println("Binary value is: "+Integer.toBinaryString(z));

    }
    public static void bitwiseOr(int x, int y){
        //111 for 7 & 10001 for 17. after comparison binary form is 10111 and 23 is decimal value.
        int z =  x | y;
        System.out.println("decimal value is: "+z);
        System.out.println("binary value is: "+Integer.toBinaryString(z));
    }

    public static void postfix_Increment(int x){
        System.out.println("value of x before increment: "+x);
        x++;
        System.out.println("value of x after increment: "+x+'\n');
    }

    public static void Unary_Operators(int x){
        System.out.println("value of x before increment: "+x);
        ++x;
        System.out.println("value of x after increment1: "+x);
        x++;
        System.out.println("value of x after increment2: "+x);
        x += 1;
        System.out.println("value of x after increment3: "+x);
    }

    public static void postfix_prefix(int x, int y){
        int sum = ++x + y;
        System.out.println(sum);

        sum = x++ + y;
        System.out.println(sum);
    }














}
