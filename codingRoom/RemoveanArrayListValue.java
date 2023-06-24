package codingRoom;

import java.util.ArrayList;

public class RemoveanArrayListValue {
    public static void main(String[] args) {
        //Remove an Arraylist value using the parameters given.And return the ArrayList.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        System.out.println("Before removing " +list1);
        System.out.println(RemoveanArrayListValue.removeArrayListValue(list1,"Three"));

    }
    public static ArrayList<String> removeArrayListValue(ArrayList<String> list, String str) {
        list.remove(str);
        return list;
    }
}
