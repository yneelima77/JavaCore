package com.perscholas.GLAB104_Interface;

public class Triangle extends Shape implements Movable {
    private int x, y;

    public Triangle() {

    }

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void displayshapName() {
        System.out.println("Drawing a Triangle of radius " + this.base);
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Triangle[ area = " + base + super.toString() + "] ";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public String getCoordinates() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void moveRight() {
        x++;
    }

}
