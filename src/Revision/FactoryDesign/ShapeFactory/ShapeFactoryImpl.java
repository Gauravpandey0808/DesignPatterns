package Revision.FactoryDesign.ShapeFactory;

import Revision.FactoryDesign.Services.Shape;
import Revision.FactoryDesign.Services.ShapesImpl.Circle;
import Revision.FactoryDesign.Services.ShapesImpl.Rectangle;
import Revision.FactoryDesign.Services.ShapesImpl.Square;
import Revision.FactoryDesign.enums.ShapeEnum;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Shape getShape(ShapeEnum currentShape) {

        if (currentShape == null) {
            throw new IllegalArgumentException("ShapeEnum cannot be null");
        }

        return switch (currentShape) {
            case CIRCLE -> new Circle(20);
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("Unknown shape: " + currentShape);
        };
    }
}
