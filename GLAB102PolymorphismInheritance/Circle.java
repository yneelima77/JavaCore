package com.perscholas.GLAB102PolymorphismInheritance;

import java.util.StringTokenizer;

public class Circle extends Shape{
    double radius;
    protected final double PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        //super.area = PI * (this.radius * this.radius);
        super.area = PI * Math.pow(this.radius, 2);
        return super.area;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius "+this.radius);
    }

    public String toString(){
        return "Circle[radius = "+ radius + super.toString() + "]";
    }
}
