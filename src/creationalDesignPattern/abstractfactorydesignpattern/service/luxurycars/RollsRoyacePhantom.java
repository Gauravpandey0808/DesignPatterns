package creationalDesignPattern.abstractfactorydesignpattern.service.luxurycars;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public class RollsRoyacePhantom implements CarFactory {
    @Override
    public void printNameOfCar() {
        System.out.println("This is Rolls Royace Phantom");

    }
}
