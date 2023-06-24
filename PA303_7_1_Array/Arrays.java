package com.perscholas.PA303_7_1_Array;

import java.util.Arrays.*;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
        Task11();
    }

    public static void Task1() {
        int[] a1 = new int[]{1, 2, 3};
        for (int i : a1) {
            System.out.println(i);
        }
    }

    public static void Task2() {
        Integer[] a1 = new Integer[]{4, 2, 9, 10, 13, 1, 0};
        int size = a1.length;
        for(int i=0;i<size;i++){
            if(i == size/2){
                System.out.println("\nmiddle element in an array is " + a1[i]);
            }
        }

    }

    public static void Task3() {
        String[] colors = new String[]{"red", "green", "blue", "yellow"};
        System.out.println("Length of string array " + colors.length);
        String[] colorsCopy = colors.clone();

        System.out.println("Original Array: " + java.util.Arrays.toString(colors));
        System.out.println("Copied Array: " + java.util.Arrays.toString(colorsCopy));
    }

    public static void Task4() {
        Integer[] num = new Integer[]{2, 4, 6, 8, 10};
        System.out.println("Value at first index: " + num[0]);
        System.out.println("Value at last index: " + num[num.length - 1]);
        System.out.println("Value at index = length: " + num[num.length]);
        num[5]= 11;
    }

    public static void Task5() {
        Integer[] num = new Integer[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        System.out.println(java.util.Arrays.toString(num));
    }

    public static void Task6() {
        Integer[] num = new Integer[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2;
        }
        System.out.println(java.util.Arrays.toString(num));
    }

    public static void Task7() {
        Integer[] num = new Integer[]{1, 2, 4, 9, 13};
        for (int i = 0; i < num.length; i++) {
            if (i == 2) {
                continue;
                //return;
            } else
                System.out.println(num[i]);
        }

    }

    public static void Task8() {
        String[] colors = new String[]{"red", "green", "blue", "yellow", "pink"};
        String temp;
        temp = colors[0];
        colors[0] = colors[2];
        colors[2] = temp;
        for (String c : colors) {
            System.out.println(c);
        }

    }

    public static void Task9() {
        Integer[] num = {4, 2, 9, 13, 1, 0};
        java.util.Arrays.sort(num);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; ++i) {
            if (num[i] < min) {
                min = num[i];
            } else if (num[i] > max)
                max = num[i];
        }
        System.out.println("Array in ascending order: "+ java.util.Arrays.toString(num));
        System.out.println("The biggest number is "+max);
        System.out.println("The smallest number is "+min);
    }

    public static void Task10() {
        Object[] arr = new Object[]{10, "green", "blue", "red", 2.75};
        for (Object a: arr) {
            System.out.println(a);
        }
    }

    public static void Task11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have?\n");
        int input1 = sc.nextInt();
        String[] input2 = new String[input1];

        String[] arr = new String[input1];
        for (int i=0; i<arr.length;i++){
            System.out.println("Enter your thing: ");
            input2[i] = sc.next();
        }
        System.out.println(java.util.Arrays.toString(input2));
    }

}




