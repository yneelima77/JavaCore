package codingRoom;

import java.util.ArrayList;
import java.util.Collections;

public class AddToArrayList {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C"};
        System.out.println(AddToArrayList.addToArrayList(letters));
    }
    public static ArrayList<String> addToArrayList(String[] s) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, s);
        return list;
    }

}
