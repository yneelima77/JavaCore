package com.perscholas.Generics_303_11_extra_labs;

public class GenericClassLAB1 {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        GenericClass<String> intObj2 = new GenericClass<>("Java Programming");
        System.out.println("Generic Class returns: " + intObj2.getData());

        GenericClass<Boolean> intObj3 = new GenericClass<>(true);
        System.out.println("Generic Class returns: " + intObj3.getData());

    }
}
