package Revision.FactoryDesign.ShapeFactory;

import Revision.FactoryDesign.Services.Shape;
import Revision.FactoryDesign.enums.ShapeEnum;

public interface ShapeFactory {

    Shape getShape(ShapeEnum currentShape);


}
