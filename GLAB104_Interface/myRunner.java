package com.perscholas.GLAB104_Interface;

public class myRunner {
    public static void main(String[] args) {
        Circle cObj = new Circle(10, 2, 3);
        System.out.println("Area of Circle " + cObj.getArea());
        System.out.println("Coordinates are " + cObj.getCoordinates());

        cObj.moveUp();
        System.out.println("After move Up, Coordinates are " + cObj.getCoordinates());
        cObj.moveDown();
        System.out.println("After move down, Coordinates are " + cObj.getCoordinates());
        cObj.moveLeft();
        System.out.println("After move left, Coordinates are " + cObj.getCoordinates());
        cObj.moveRight();
        System.out.println("After move right, Coordinates are " + cObj.getCoordinates());

        System.out.println("--------Test Polymorphism-------");
        Movable cObj2 = new Circle(100, 10, 20); //upcasting
        cObj2.moveUp();
        System.out.println("After move Up, Coordinates are " + cObj2.getCoordinates());
        cObj2.moveDown();
        System.out.println("After move down, Coordinates are " + cObj2.getCoordinates());

        System.out.println("----------------------");
        Movable rObj2 = new Rectangle(10, 20);
        Rectangle rObj = new Rectangle(10, 20.0);
        System.out.println("Area of Rectangle " + rObj.getArea());
        rObj2.moveUp();
        System.out.println("After move Up, Coordinates are " + rObj2.getCoordinates());
        rObj2.moveDown();
        System.out.println("After move down, Coordinates are " + rObj2.getCoordinates());

        System.out.println("----------------------");
        Movable tObj2 = new Triangle(10, 20);
        Triangle tObj = new Triangle(10.0, 20.0);
        System.out.println("Area of Triangle " + tObj.getArea());
        tObj2.moveUp();
        System.out.println("After move Up, Coordinates are " + tObj2.getCoordinates());
        tObj2.moveDown();
        System.out.println("After move down, Coordinates are " + tObj2.getCoordinates());





    }
}
