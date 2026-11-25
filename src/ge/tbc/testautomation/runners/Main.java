package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.Triangle;

public class Main {
    public static void main(String[] args) {
        //Circles

        // Normal

        Circle circle = new Circle(1.0);
        circle.printPackageName();
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());


        // Double size
        circle.doubleSize();
        System.out.println(circle.getRadius());
        System.out.println(+ circle.getArea());

        //Custom size
        circle.customSize(3);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        //Wrong one
        Circle invalidCircle = new Circle(-2.0);
        System.out.println("Invalid" + invalidCircle.validateFigure());

       // Triangles
        // Normal
        // Previous One was 6 and it cant be
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, 4.0;
        triangle.printPackageName();
        System.out.println(triangle.getArea());
        System.out.println(triangle.getLength());
        //Double size
        triangle.doubleSize();
        System.out.println(triangle.getLength());
        System.out.println(triangle.getArea());

        //Custom Size
        triangle.customSize(2.0);
        System.out.println(triangle.getLength());
        System.out.println(triangle.getArea());
        //Wrong
        Triangle invalidTriangle = new Triangle(1.0, 2.0, 8.0, 2.0);
        System.out.println("Invalid triangle valid: " + invalidTriangle.validateFigure());
    }
}