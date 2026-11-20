package ge.tbc.testautomation.figures;

public class Triangle extends Figure {
    public double a;
    public double b;
    public double c;
    public double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5 * b * h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}