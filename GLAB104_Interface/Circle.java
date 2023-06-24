package com.perscholas.GLAB104_Interface;

public class Circle extends Shape implements Movable {
    protected double radius;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveRight() {
        x--;
    }

    @Override
    public void moveLeft() {
        x++;
    }

    @Override
    public String getCoordinates() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    public void displayshapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "] ";
    }


}
