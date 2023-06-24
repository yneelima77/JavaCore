package com.perscholas.GLAB8EncapsulationinJava;

public class EncapsulationExample extends Humanbeing {
    public static void main(String[] args) {
        Humanbeing hb = new Humanbeing();
        hb.setHeight(1.65f);
        hb.setWeight(68);
        hb.setBmi(CalculateBMI(hb));

        // using getters of HumanBeing
        System.out.println("Person has "+hb.getWeight()+" kgs and is "+hb.getHeight()+" meters in height, which results in BMI of "+hb.getBmi());

    }

    public static float CalculateBMI(Humanbeing hb){
        return hb.getWeight()/(hb.getHeight() * hb.getHeight());

    }

}
