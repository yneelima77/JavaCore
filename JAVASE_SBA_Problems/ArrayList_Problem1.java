package JAVASE_SBA_Problems;

import java.util.*;

public class ArrayList_Problem1 {
    class InvalidStringException extends Exception{
        public InvalidStringException(String message){
            super(message);
        }
    }

    class ArrayToList {
        ArrayList<String> arrayToList;

        public ArrayToList(){
            arrayToList = new ArrayList<>();

        }
        public void convert(String[] a){
            Arrays.stream(a).forEach(string -> {arrayToList.add(string);
                System.out.println("I have added the string: " + string + " at the index: "+ arrayToList.lastIndexOf(string));});
        }
        public void replace(int idx){
            if(arrayToList.size()>idx && arrayToList.get(idx)!= null){
                System.out.println("I have replaced the string: "+ arrayToList.get(idx)  +" with a null string");
                arrayToList.set(idx, "");
            }
        }
        public ArrayList<String> compact(){
            arrayToList.removeAll(Arrays.asList(""));
            return arrayToList;
        }

    }
}
