package com.perscholas.GLAB10InheritaneandObjectTypeCasting;

public class Girl extends Person{
    static double agefactor = 1.3;
    public Girl(String aName){
        name = "Ms."+aName;
    }

    public String talk(){
        return ("Hello"+jump());
    }
    public String jump(){
        return ("I am jumping");
    }
    public static double lifespan(){
        return (lifespan * agefactor);
    }
}
