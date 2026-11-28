package ge.tbc.testautomation.containersAndComparing;

public class Circle implements Comparable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius + "";
    }

    @Override
    public int compareTo(Object o) {
        Circle other = (Circle) o;
        if (this.radius > other.radius) {
            return 1;
        } else if (this.radius < other.radius) {
            return -1;
        } else {
            return 0;
        }
    }
}