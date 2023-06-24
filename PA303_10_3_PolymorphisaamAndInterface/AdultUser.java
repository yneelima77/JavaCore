package com.perscholas.PA303_10_3_PolymorphisaamAndInterface;

public class AdultUser implements LibraryUser {
    int age;
    String bookType;

   /* public AdultUser(String bookType) {
        this.bookType = bookType;
    }

    public AdultUser(int age) {
        this.age = age;
    }
*/
    public void registerAccount(int age) {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else if(age <= 11)
            System.out.println("Sorry, age must be greater than 12 to register as an Adult.");
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType == "Fiction") {
            System.out.println("“Book issued successfully, please return the book within 7 days");
        } else
            System.out.println("Oops, you are allowed to take only adult Fiction books.");

    }
}
