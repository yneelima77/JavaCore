package com.perscholas.GLAB3JavaStringMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        Length("Java", "");
        IsEmptyExample("", "Hello");
        StringTrimExample("  Hello  ");
        StringLowerExample("INTELLIJ IS VERY INTELLIGENT");
        StringUpperExample("intellij is very intelligent");
        concatDemo("Learn ", "Java", "Chapter ");
        JavaSplit("a::b::c::d:e");
        CharAtMethod("Welcome to Java");
        CompareTo("hello", "ioat", "hemlo", "flag");
        substringDemo("java is not fun");
        IndexOfMethod("java is not fun");
        Containexmaple("Java Language");
        replaceDemoMain();
        StringComparison_Equals();


    }

    public static void Length(String str1, String str2) {
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());
    }

    public static void IsEmptyExample(String s1, String s2) {
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    public static void StringTrimExample(String s1){
        System.out.println(s1+"how are you");
        System.out.println(s1.trim()+"how are you");
    }

    public static void StringLowerExample(String s1){
        String s2 = s1.toLowerCase();
        System.out.println("Lowercase of "+ "'" + s1 + "'" + " : "+s2);
    }

    public static void StringUpperExample(String s1){
        String s2 = s1.toUpperCase();
        System.out.println("Uppercase of "+"'" + s1 + "'"+" : "+s2);
    }

    public static void concatDemo(String str1, String str2, String str5 ) {
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));
        //--- By using + operator---
        String str3 = str1 + str2;
        System.out.println(str3);

        // Three strings are concatenated
        String str4 = str1 + str2 + str3;
        System.out.println(str4);

        // String str5 is concatenated with number 2 and character
        String ChapterNum = str5 + 2 + 'B';
        System.out.println(ChapterNum);
    }

    public static void JavaSplit(String vowels){
        String[] split1 = vowels.split("::");
        String[] split = vowels.split("::", 2);
        System.out.println(Arrays.toString(split1));
        System.out.println(Arrays.toString(split));
    }

    public static void CharAtMethod(String message){
        System.out.println(message.charAt(0));
        for(int i =0; i< message.length(); i++){
            Character c = message.charAt(i);
            System.out.println(c);
        }
    }

    public static void CompareTo(String s1, String s2, String s3, String s4){
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//-1
        System.out.println(s1.compareTo(s4));//2

    }

    public static void substringDemo(String str1){
        System.out.println(str1.substring(0, 4));
    }

    public static void IndexOfMethod(String str1){
        int result;
        result = str1.indexOf('n');
        System.out.println(result);

        result = str1.lastIndexOf("is");
        System.out.println(result);
    }

    public static void Containexmaple(String str1){
        // check if str1 contains "Java"
        boolean result = str1.contains("Java");
        System.out.println(result);  // true

        // check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);  // false

        // check if str1 contains ""
        result = str1.contains("");

        System.out.println(result);  // true

    }

    public static void replaceDemoMain(){
        String str = "abc def";
        System.out.println(str.replace('f', 'c'));
        System.out.println("Java".replace('J', 'L'));
        // character not in the string(replace returns original string)
        System.out.println("Hello".replace('4', 'J'));
        System.out.println(str.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));
    }

    public static void StringComparison_Equals(){
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }

    public static void StringComparison_EqualOperator() {
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = new String("PerScholas");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);//false because s3 reference stored in heap
    }




    }
