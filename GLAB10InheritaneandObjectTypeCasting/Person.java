package com.perscholas.GLAB10InheritaneandObjectTypeCasting;

public class Person {
    String name;
    public static int lifespan = 60;
    public static double agefactor = 1.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        name = "";
    }
    public Person(String name){
        this.name = name;
    }

    public String toString(){
        return ("Hello, my name is \"" + name);
    }
    public String talk() {
        return("I have nothing to say.");
    }
    public String walk() {
        return("I have nowhere to go.");
    }
    public static double lifeSpan() {
        return(lifespan * agefactor);
    }
}
