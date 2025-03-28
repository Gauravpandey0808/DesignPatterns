package Revision.FactoryDesign.Services.ShapesImpl;

import Revision.FactoryDesign.Services.CurvedShaped;

public class Circle implements CurvedShaped {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public int getRadius() {

        return radius;
    }

    @Override
    public void shape() {
        System.out.println("This is circle");

    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
