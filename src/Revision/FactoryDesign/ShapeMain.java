package Revision.FactoryDesign;

import Revision.FactoryDesign.Services.Shape;
import Revision.FactoryDesign.ShapeFactory.ShapeFactory;
import Revision.FactoryDesign.ShapeFactory.ShapeFactoryImpl;
import Revision.FactoryDesign.enums.ShapeEnum;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class ShapeMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        Shape shape =shapeFactory.getShape(ShapeEnum.CIRCLE);

        double area = shape.getArea();

        System.out.println(area);

        BiPredicate<Integer, Integer> predicate  = (x, y) -> x % y == 0;

        if(predicate.test(2, 2)) System.out.println("Yes it is divisible");
        else System.out.println("Not divisible");

        BiFunction<Integer, Integer, Integer> biFunction = Integer :: sum;
        System.out.println(biFunction.apply(20, 30));






    }
}
