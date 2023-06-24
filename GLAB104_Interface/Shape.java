package com.perscholas.GLAB104_Interface;

public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;



    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setBase(double base) {
        this.base = base;
    }
    // The getArea method is abstract.
    // It must be overridden in a subclass.

    /**
     * All shapes must provide a method called getArea()
     */
    public abstract double getArea();

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapName() {
        System.out.println("I am a Shape.");
    }
}
