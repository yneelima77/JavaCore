package com.perscholas.GLAB4ScannerClass;

import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        int s4 = input.nextInt();
        System.out.print("Enter a character: ");
        String s5 = input.nextLine();
        char ch = s5.charAt(1);

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        System.out.println("s4 is " + s4);

        System.out.println("The character entered is " + ch);

    }
}
