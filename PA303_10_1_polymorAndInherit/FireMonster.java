package com.perscholas.PA303_10_1_polymorAndInherit;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    public void attack(){
        System.out.println("Attacking with "+this.name+"!");
    }

}
