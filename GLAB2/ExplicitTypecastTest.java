package com.perscholas.GLAB2;

public class ExplicitTypecastTest {
    public static void main(String[] args) {
        double d = 100.04;
        // explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d); // fractional part lost.
        System.out.println("Long value "+l); // fractional part lost.
        System.out.println("Int value "+i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("i = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("d = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println("d = " + dou + " b = " + Integer.toBinaryString(b)+" = "+b);

    }
}
