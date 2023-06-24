package com.perscholas.GLAB7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        arraydemoOne();
        arraydemoTwo();
        EnhancedForLoop();
        arraydemothree();
        insertElements();
        MeanStandardDeviationArray();

    }

    public static void  arraydemoOne(){
        int[] age = {12, 4, 5, 2, 5};
        System.out.println("Accessing Elements of an Array");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }

    public static void arraydemoTwo(){
        int[] age = {12, 4, 5, 8, 2};
        System.out.println("Accessing array using for loop");

        for (int i=0; i< age.length; i++){
            System.out.println(age[i]);
        }
    }

    public static void EnhancedForLoop(){
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for(String n: names){
            System.out.println(n);
        }
    }

    public static void arraydemothree(){
        Integer[] num = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;

        for (Integer n:num) {
            sum += n;
        }
        double average = (double) (sum/num.length);
        System.out.println(sum +" and "+ average);
    }

    public static void  MeanStandardDeviationArray(){
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean = 0, stdDev = 0;

        for(int i=0;i<marks.length;i++){
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double) sum/marks.length;
        stdDev = Math.sqrt(sumSq/marks.length - mean * mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);


    }

    public static void  insertElements(){
        int[] arr = new int[12];
        int i,elements;

        int length = arr.length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 elements");
        for(i = 0; i<11;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter an element to insert into array");
        elements = input.nextInt();
        arr[i] = elements;

        System.out.println("New array is: ");
        length = arr.length;
        for(i=0;i<length;i++){
        }
        System.out.println(Arrays.toString(arr));
    }


}
