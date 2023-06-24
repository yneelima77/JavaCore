package Perscholas_ClassPractice;

public class Area_of_Circle {
    static double Area;
    public static void main(String[] args) {
        double radius;
        double area;

        radius = 20;
        area = radius * radius * 3.14159;
        Area = radius * radius * Math.PI;

        System.out.println("The area of the circle is: "+area);
        System.out.println(Area);

    }
}
