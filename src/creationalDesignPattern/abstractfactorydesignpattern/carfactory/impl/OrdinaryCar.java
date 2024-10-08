package creationalDesignPattern.abstractfactorydesignpattern.carfactory.impl;

import creationalDesignPattern.abstractfactorydesignpattern.carfactory.CarTypeAbstractFactory;
import creationalDesignPattern.abstractfactorydesignpattern.enums.OrdinaryCarsEnums;
import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;
import creationalDesignPattern.abstractfactorydesignpattern.service.ordinarycars.FordFocus;
import creationalDesignPattern.abstractfactorydesignpattern.service.ordinarycars.HondaCivic;
import creationalDesignPattern.abstractfactorydesignpattern.service.ordinarycars.ToyotaCamry;

public class OrdinaryCar implements CarTypeAbstractFactory {
    @Override
    public CarFactory getCar(Enum<?> carType) throws Exception {
        if(carType instanceof OrdinaryCarsEnums ordinaryCarsEnums) {
            return switch (ordinaryCarsEnums) {
                case FORD_FOCUS -> new FordFocus();
                case HONDA_CIVIC -> new HondaCivic();
                case TOYOTA_CAMRY -> new ToyotaCamry();
            };
        }
        throw new Exception("Wrong instance send");
    }
}
