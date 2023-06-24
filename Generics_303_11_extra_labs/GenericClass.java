package com.perscholas.Generics_303_11_extra_labs;

public class GenericClass <T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}
