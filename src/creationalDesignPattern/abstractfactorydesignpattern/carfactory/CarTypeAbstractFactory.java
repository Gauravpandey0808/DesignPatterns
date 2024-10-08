package creationalDesignPattern.abstractfactorydesignpattern.carfactory;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public interface CarTypeAbstractFactory {

    CarFactory getCar(Enum<?> carTypeEnum) throws Exception;
}
