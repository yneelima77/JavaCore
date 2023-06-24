package com.perscholas.GLAB8EncapsulationinJava;

public class Humanbeing {
    private float weight;
    private float height;
    private float bmi;

    public Humanbeing(float weignt, float height, float bmi){
        this.weight = weignt;
        this.height = height;
        this.bmi = bmi;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public Humanbeing(){

    }
}
