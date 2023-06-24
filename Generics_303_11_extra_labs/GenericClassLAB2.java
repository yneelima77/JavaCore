package com.perscholas.Generics_303_11_extra_labs;

public class GenericClassLAB2 <T extends Number>{
    public static void main(String[] args) {
        //GenericClassLAB2<String> obj = new GenericClassLAB2<>();
        // Type T is bound to extend Number class so T should be instantiated as number or subclasses of number type
        GenericClassLAB2<Integer> obj = new GenericClassLAB2<>();
        obj.display();    }

    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}
