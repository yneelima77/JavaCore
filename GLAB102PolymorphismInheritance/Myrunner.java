package com.perscholas.GLAB102PolymorphismInheritance;

public class Myrunner {
    public static void main(String[] args) {
        Circle circle = new Circle(100);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle("Blue");
        // Example of Object type casting
        // declaration of object variable obj of the Shape class

        // Shape sObj ; // object creation of the Shape class
        Shape sObj = new Shape();
        sObj.displayshapName();
        System.out.println(sObj instanceof Shape);

        // object creation of the Circle class using upcasting
        System.out.println("+++++++++");
        // it’s fine because a Circle is a Shape by inheritance
        Shape circleObj = new Circle(100);
        circleObj.displayshapName();
        System.out.println("Area of circle "+circleObj.getArea());
        System.out.println(circleObj);//Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(circleObj instanceof Circle);
        System.out.println(sObj instanceof Circle);

        // object creation of the Rectangle class using upcasting
        System.out.println("--------------------");
        Shape rectangleObj = new Rectangle("Red"); //UpCasting
        rectangleObj.displayshapName();
        rectangleObj.setHeight(2);
        rectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + rectangleObj.getArea());
        System.out.println(rectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(rectangleObj instanceof Rectangle); // true
        System.out.println(sObj instanceof Rectangle); // false because Shape is not a Rectangle

        // object creation of the triangle class using upcasting
        System.out.println("--------------------");
        Shape triangleObj = new Triangle("Blue"); //UpCasting
        triangleObj.displayshapName();
        triangleObj.setHeight(2);
        triangleObj.setBase(3);
        System.out.println("Area of Triangle is " + triangleObj.getArea());
        System.out.println(triangleObj);  // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(triangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because Shape is not a Triangle

        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3); //UpCasting
        cylinderShape.displayshapName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);  // Run cylinderShape's toString()

    }
}
