package com.perscholas.PA303_10_1_polymorAndInherit;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }
    public void attack(){
        System.out.println("Attack with "+this.name+"!");
    }


}
