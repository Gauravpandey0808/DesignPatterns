package Revision.FactoryDesign.Services.ShapesImpl;

import Revision.FactoryDesign.Services.PolygonalShape;

public class Square implements PolygonalShape {

    int length;
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getBreadth() {
        return 0;
    }

    @Override
    public void shape() {
        System.out.println("This is a square");

    }

    @Override
    public double getArea() {
        return length * length;
    }
}
