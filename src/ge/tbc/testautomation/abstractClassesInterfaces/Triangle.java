package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figure implements IResizable, IValidFigure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        boolean valid = validateFigure();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5 * b * h;
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public void doubleSize() {
        a = a * 2;
        b = b * 2;
        c = c * 2;
        h = h * 2;
    }

    @Override
    public void customSize(double byValue) {
        a = a * byValue;
        b = b * byValue;
        c = c * byValue;
        h = h * byValue;
    }

    @Override
    public boolean validateFigure() {
        boolean sidesPositive = a > 0 && b > 0 && c > 0 && h > 0;
        boolean canExist = (a + b > c) && (a + c > b) && (b + c > a);
        if (sidesPositive && canExist) {
            return true;
        } else {
            return false;
        }
    }
}