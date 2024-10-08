package creationalDesignPattern.abstractfactorydesignpattern.carfactory;

import creationalDesignPattern.abstractfactorydesignpattern.carfactory.impl.LuxuryCar;
import creationalDesignPattern.abstractfactorydesignpattern.carfactory.impl.OrdinaryCar;
import creationalDesignPattern.abstractfactorydesignpattern.enums.CarTypeEnums;

public class FactoryProducer {

    public  CarTypeAbstractFactory getCarType(CarTypeEnums carTypeEnums) {

        return switch (carTypeEnums) {
            case LUXURY -> new LuxuryCar();
            case ORDINARY -> new OrdinaryCar();
        };
    }
}
