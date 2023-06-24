package HackerRank;

import java.util.Comparator;

public class ArrayListSort {
    public static void main(String[] args) {
        Integer[] arry = {22, 78, 99,23,45};
        for(int i=0; i<arry.length;i++){
            System.out.println(arry[i]);
        }
        int temp;

        for(int i=0; i<arry.length;i++){
            for (int j=i; j<arry.length;j++){
                temp = arry[i];
                arry[i] = arry[j];
                arry[j] = temp;
            }
        }

        for (int i: arry){
            System.out.println(i);
        }

        java.util.Arrays.sort(arry);
        System.out.println(" ");
        for (Integer i: arry){
            System.out.println(i);
        }
        System.out.println(" ");

        java.util.Arrays.sort(arry, Comparator.reverseOrder());
        for (Integer i: arry){
            System.out.println(i);
        }


    }
}
