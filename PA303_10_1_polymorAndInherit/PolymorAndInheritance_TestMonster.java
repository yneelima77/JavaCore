package com.perscholas.PA303_10_1_polymorAndInherit;

public class PolymorAndInheritance_TestMonster {
    public static void main(String[] args) {
        Monster m1 =  new FireMonster("Fire");
        Monster m2 = new WaterMonster("Water");
        Monster m3 = new StoneMonster("Stones");
        // Invoke the actual implementation
        m1.attack();
        m2.attack();
        m3.attack();

        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("Stones");
        m1.attack();

        // We have a problem here!!!
        Monster m4 = new Monster("Monster");
        m4.attack();

    }
}
