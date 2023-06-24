package com.perscholas.PA303_10_3_PolymorphisaamAndInterface;

public class KidUser implements LibraryUser {
    int age;
    String bookType;

   /* public KidUser(int age) {
        this.age = age;
    }

    public KidUser(String bookType){
        this.bookType = bookType;
    }*/

    @Override
    public void registerAccount(int age) {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType == "Kids") {
            System.out.println("“Book issued successfully, please return the book within 10 days");
        } else
            System.out.println("Oops, you are allowed to take only kids books.");

    }
}
