package Perscholas_ClassPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ResizableArray {
    public static void main(String[] args) {
        //write a program that will enable an array to be resized.  u must use array   NOT arraylist!
        int[] A1 = new int[5];
        for (int i: A1) {
            System.out.println("Original Array: "+ i);
        }
        int[] A2 = Arrays.copyOf(A1, 15);
        for (int i: A2) {
            System.out.println(i);
        }

    }

}
