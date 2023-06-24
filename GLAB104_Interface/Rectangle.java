package com.perscholas.GLAB104_Interface;

public class Rectangle extends Shape implements Movable{
    protected double radius;
    private int x, y;   // x and y coordinates of the point
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Rectangle() {

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
        x++;
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
    public double getArea() {
        this.base = this.width * this.height;
        return base;
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a rectangle of base " + this.base);
    }
    public String toString() {
        return "Rectangle[ base = " + base + super.toString() + "] ";
    }
}
