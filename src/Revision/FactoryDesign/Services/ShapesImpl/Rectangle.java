package Revision.FactoryDesign.Services.ShapesImpl;

import Revision.FactoryDesign.Services.PolygonalShape;

public class Rectangle implements PolygonalShape {
    int length;
    int breadth;
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getBreadth() {
        return breadth;
    }

    @Override
    public void shape() {
        System.out.println("This is rectangular in shape");

    }

    @Override
    public double getArea() {
        return length * breadth;
    }
}
