package com.perscholas.GLAB10InheritaneandObjectTypeCasting;

public class Boy extends Person{
    static  double agefactor = 1.1;
    public Boy(String aname){
        name = aname;
    }
    public String talk(){
        return (super.talk()+"... but I love Java class.");
    }
    public String walk(){
        return ("I am now walking");
    }
}
