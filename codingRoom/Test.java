package codingRoom;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        sum(9131);
        sub(9131);
    }

    public static void sum(int num) {

        String s = String.valueOf(num);
        //System.out.println(s);
        //int sum = Character.getNumericValue(s.charAt(0));
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public static void sub(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num%10);
            num /=10;
        }
        int sub = list.get(list.size()-1);
        for(int i=list.size()-2; i>=0;i--){
            sub -=list.get(i);

        }
        System.out.println(sub);
    }


}
