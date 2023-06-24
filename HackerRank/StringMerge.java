package HackerRank;

import java.util.StringJoiner;

public class StringMerge {
    public static void main(String[] args) {

        String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        StringJoiner sj1 = new StringJoiner(", ", "[Name:", "]");
        StringJoiner sj2 = new StringJoiner(":", "***", "***");
        sj1.add(names[0]);
        sj1.add(names[1]);
        sj1.add(names[2]);

        System.out.println(sj1);
        sj2.add(names[3]);
        sj2.add(names[4]);
        System.out.println(sj2);

        sj1.merge(sj2);
        System.out.println("sj1 = " + sj1);
    }
}
