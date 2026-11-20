package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Figure;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;

public class Main {

    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println("Figure area: " + figure.getArea());
        System.out.println("Figure perimeter: " + figure.getPerimeter());

        Rectangle rectangle = new Rectangle(1.1, 2.2);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3.3, 4.4, 5.5, 6.6);
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

    }

}