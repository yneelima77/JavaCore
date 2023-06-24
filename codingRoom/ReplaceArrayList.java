package codingRoom;

import java.util.ArrayList;

public class ReplaceArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        System.out.println(list1);
        System.out.println(ReplaceArrayList.replaceArrayListValue(list1, 2, "Six"));
    }
    public static ArrayList<String> replaceArrayListValue(ArrayList<String> list, int index, String s){
        list.set(index, s);
        return list;
    }
}
