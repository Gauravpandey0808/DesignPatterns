package creationalDesignPattern.abstractfactorydesignpattern.service.ordinarycars;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public class HondaCivic implements CarFactory {
    @Override
    public void printNameOfCar() {
        System.out.println("This is Honda Civic");
    }

}
