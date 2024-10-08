package creationalDesignPattern.abstractfactorydesignpattern;

import creationalDesignPattern.abstractfactorydesignpattern.carfactory.CarTypeAbstractFactory;
import creationalDesignPattern.abstractfactorydesignpattern.carfactory.FactoryProducer;
import creationalDesignPattern.abstractfactorydesignpattern.enums.CarTypeEnums;
import creationalDesignPattern.abstractfactorydesignpattern.enums.LuxuryCarsEnums;
import creationalDesignPattern.abstractfactorydesignpattern.enums.OrdinaryCarsEnums;
import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

/**
 * <p>
 *
 *     Abstract Factory is a creational design pattern that lets
 *     you produce families of related objects without specifying
 *     their concrete classes.
 *
 * </p>
 *
 */

public class AbstractMainClass {

    public static void main(String[] args) throws Exception {
        FactoryProducer factoryProducer = new FactoryProducer();
        CarTypeAbstractFactory carTypeAbstractFactory =factoryProducer.getCarType(CarTypeEnums.ORDINARY);
        CarFactory carFactory = carTypeAbstractFactory.getCar(OrdinaryCarsEnums.FORD_FOCUS);
        carFactory.printNameOfCar();

        CarTypeAbstractFactory carTypeAbstractLuxuryFactory =factoryProducer.getCarType(CarTypeEnums.LUXURY);
        CarFactory carFactory2 = carTypeAbstractLuxuryFactory.getCar(LuxuryCarsEnums.MERCEDES_BENZ_S_CLASS);
        carFactory2.printNameOfCar();
    }
}
