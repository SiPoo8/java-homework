package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.containersAndComparing.Circle;
import ge.tbc.testautomation.containersAndComparing.Rectangle;
import ge.tbc.testautomation.containersAndComparing.RectangleReverseComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ContainersAndComparing {
    public static void main(String[] args) {

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-542-231");
        phoneNumbers.add("555-887-987");
        phoneNumbers.add("555-161-143");
        phoneNumbers.add("555-189-6667");


        Iterator<String> iterator = phoneNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, String> contacts = new HashMap<>();
        contacts.put("ნიკა", phoneNumbers.get(0));
        contacts.put("გიორგი", phoneNumbers.get(1));
        contacts.put("ლუკა", phoneNumbers.get(2));
        contacts.put("მარიამი", phoneNumbers.get(3));

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        Set<Circle> circleTreeSet = new TreeSet<>();
        circleTreeSet.add(new Circle(5.0));
        circleTreeSet.add(new Circle(2.0));
        circleTreeSet.add(new Circle(8.0));
        circleTreeSet.add(new Circle(5.0));
        circleTreeSet.add(new Circle(3.5));
        circleTreeSet.add(new Circle(10.0));
        circleTreeSet.add(new Circle(2.0));
        circleTreeSet.add(new Circle(1.5));
        circleTreeSet.add(new Circle(7.0));
        circleTreeSet.add(new Circle(8.0));

        for (Circle circle : circleTreeSet) {
            System.out.println(circle);
        }

        Set<Circle> circleHashSet = new HashSet<>();
        circleHashSet.add(new Circle(5.0));
        circleHashSet.add(new Circle(2.0));
        circleHashSet.add(new Circle(8.0));
        circleHashSet.add(new Circle(5.0));
        circleHashSet.add(new Circle(3.5));
        circleHashSet.add(new Circle(10.0));
        circleHashSet.add(new Circle(2.0));
        circleHashSet.add(new Circle(1.5));
        circleHashSet.add(new Circle(7.0));
        circleHashSet.add(new Circle(8.0));

        for (Circle c : circleHashSet) {
            System.out.println(c);
        }

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2.0, 3.0));  // area 6
        rectangles.add(new Rectangle(5.0, 4.0));  // area 20
        rectangles.add(new Rectangle(3.0, 3.0));  // area 9
        rectangles.add(new Rectangle(10.0, 2.0)); // area 20

        Collections.sort(rectangles, new RectangleReverseComparator());

        for (Rectangle rectagle : rectangles) {
            System.out.println(rectagle);
        }
    }
}