package ge.tbc.testautomation.containersAndComparing;

import java.util.Comparator;

public class RectangleReverseComparator implements Comparator {

    @Override
    public int compare(Object object1, Object object2) {
        Rectangle rectangle1 = (Rectangle) object1;
        Rectangle rectangle2 = (Rectangle) object2;

        if (rectangle1.getArea() < rectangle2.getArea()) {
            return 1;
        } else if (rectangle1.getArea() > rectangle2.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}