package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        boolean isValid = validateFigure();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.141 * radius * radius;
    }

    @Override
    public double getLength() {
        return 3.141 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public void doubleSize() {
        radius = radius * 2;
    }

    @Override
    public void customSize(double byValue) {
        radius = radius * byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }
}