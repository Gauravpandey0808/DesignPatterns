package creationalDesignPattern.abstractfactorydesignpattern.service.ordinarycars;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public class FordFocus implements CarFactory {
    @Override
    public void printNameOfCar() {
        System.out.println("This is Ford Focus");
    }
}
