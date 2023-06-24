package com.perscholas.GLAB303_11_3_ArrayListofUserDefinedObjets;

import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        AddDataToArrayList addDataToArrayList = new AddDataToArrayList();
        ArrayList<Book> myBookList = addDataToArrayList.bookDetails();
        for (Book bookList : myBookList) {
            System.out.println(bookList.getNumber() + " " + bookList.getName() + " " + bookList.getCategory() + " " + bookList.getAuthor());
        }

    }
}

