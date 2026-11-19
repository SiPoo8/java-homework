package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.1);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle2 = new Circle(2.2);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle3 = new Circle(3.3);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle4 = new Circle(4.4);
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle5 = new Circle(5.5);
        System.out.println(Circle.numberOfCircleInstances);

        String str1 = Util.circleToString(circle1);
        System.out.println(str1);

        String str2 = Util.circleToString(circle2);
        System.out.println(str2);

        String str3 = Util.circleToString(circle3);
        System.out.println(str3);

        String str4 = Util.circleToString(circle4);
        System.out.println(str4);

        String str5 = Util.circleToString(circle5);
        System.out.println(str5);
    }
}