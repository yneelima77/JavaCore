package com.perscholas.GLAB303_11_6_HashMapTreeMapProcessing;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String num1, String num2) {
        int val = num1.compareTo(num2);
        if(val >0){
            return -1;
        } else if (val < 0) {
            return -1;
        }else
        return 0;
    }
}
