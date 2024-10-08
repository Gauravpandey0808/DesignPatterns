package creationalDesignPattern.abstractfactorydesignpattern.carfactory.impl;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;
import creationalDesignPattern.abstractfactorydesignpattern.carfactory.CarTypeAbstractFactory;
import creationalDesignPattern.abstractfactorydesignpattern.enums.LuxuryCarsEnums;
import creationalDesignPattern.abstractfactorydesignpattern.service.luxurycars.BentleyContinentalGT;
import creationalDesignPattern.abstractfactorydesignpattern.service.luxurycars.MercedesBenzSClass;
import creationalDesignPattern.abstractfactorydesignpattern.service.luxurycars.RollsRoyacePhantom;

public class LuxuryCar implements CarTypeAbstractFactory  {
    @Override
    public CarFactory getCar(Enum<?> carType) throws Exception {
        if(carType instanceof LuxuryCarsEnums luxuryCars) {
            return switch (luxuryCars) {
                case ROLLS_ROYCE_PHANTOM -> new RollsRoyacePhantom();
                case BENTLEY_CONTINENTAL_GT -> new BentleyContinentalGT();
                case MERCEDES_BENZ_S_CLASS -> new MercedesBenzSClass();
            };
        }
        throw new Exception("Wrong instance send");
    }
}
