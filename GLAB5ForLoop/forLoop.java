package com.perscholas.GLAB5ForLoop;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Display_a_Text_Five_Times();
        Display_Sumof_n_Natural_Numbers();
        Palindrome();
        PyramidExample();

    }

    public static void Display_a_Text_Five_Times() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text here");
        String text = scanner.next();

        for (int i = 0; i < 5; i++) {
            System.out.println(text);
        }
    }

    // Program to find the sum of natural numbers from 1 to 1000.
    public static void Display_Sumof_n_Natural_Numbers() {
        int n = 1000;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of number from 1 to 1000 is " + sum);
    }

    public static void Palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number here");
        String num, rev = "";
        num = scanner.nextLine();
        int length = num.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + num.charAt(i);
        }
        if (rev.equals(num)) {
            System.out.println(num + " is palindrome");
        } else
            System.out.println(num + " is not palindrome");


    }

    public static void PyramidExample() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
