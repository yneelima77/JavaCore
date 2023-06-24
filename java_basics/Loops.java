package com.perscholas.java_basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        table();
        GreatestCommonDivisor();
        Predict_future_Tuition();

    }

    public static void table() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = scanner.nextInt();
        System.out.println("enter limit: ");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println("\n");
        }

    }

    public static void GreatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number1: ");
        int n1 = scanner.nextInt();
        System.out.println("enter number2: ");
        int n2 = scanner.nextInt();
        int temp = 0;

        for (int k = 2; k < Math.max(n1, n2); k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                temp = k;
            }
        }
        System.out.println("Greatest common divisor of " + n1 + " and " + n2 + "is: " + temp);
    }

    public static void Predict_future_Tuition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tuitionFee: ");
        double tuitionFee = scanner.nextDouble();
        double fee = tuitionFee * 2;
        int year = 0;

        while (tuitionFee < fee) {
            tuitionFee = tuitionFee * 1.07;
            year++;
        }
        System.out.println("tuition fee doubles in " + year + " year's is " + tuitionFee);

    }
}
