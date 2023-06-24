package com.perscholas.GLAB7Arrays;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray.isEmpty());
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);
        dynamicArray.add(60);
        dynamicArray.insert(3,35);

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);
        System.out.println(dynamicArray.isEmpty());

    }
}
