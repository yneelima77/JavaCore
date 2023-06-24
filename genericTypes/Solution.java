package Perscholas_ClassPractice.genericTypes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        MyCalculator mc = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        mc.power(n, p);

    }
}


