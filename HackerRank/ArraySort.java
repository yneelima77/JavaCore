package HackerRank;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arry = {22, 78, 99, 23, 45};

        System.out.println("Unsorted array");
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        System.out.println(" ");
        int temp;

        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = i; j < arry.length - 1; j++) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;

            }
        }
        Arrays.sort(arry);
        System.out.println("Sorted array");

        for (int i : arry) {
            System.out.println(i);
        }
        System.out.println(" ");

        //Descending order
        for (int i = 0; i < arry.length; i++) {
            for (int j = i; j < arry.length; j++) {
                if (arry[i] < arry[j]) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        System.out.println("sorted in descending order");
        for (int i : arry) {
            System.out.println(i);
        }

    }
}
