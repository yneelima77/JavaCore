package codingRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyToArray {
    public static void main(String[] args) {
        String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        String letter = "a";
        CopyToArray.copyToArray(names, letter);

    }

    /*1.Copy a value to an array using the parameters given.
    And return the array. The String array should receive the same value for every index. */
    public static String[] copyToArray(String[] str, String s) {
        String[] array = new String[8];
        List<String> list = new ArrayList<String>(Arrays.asList(array));
       Collections.fill(list, s);
       array = list.toArray(new String[list.size()]);
       System.out.println(Arrays.toString(array));
        return array;
    }
}