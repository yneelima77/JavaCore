package com.perscholas.PA303_10_3_PolymorphisaamAndInterface;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        //TestCase#1
        KidUser ku1 = new KidUser();
        ku1.registerAccount(10);
        ku1.registerAccount(18);
        ku1.requestBook("Kids");
        ku1.requestBook("Fiction");

        System.out.println("**************************");
        AdultUser au1 = new AdultUser();
        au1.registerAccount(5);
        au1.registerAccount(23);
        au1.requestBook("Kids");
        au1.requestBook("Fiction");
    }
}
