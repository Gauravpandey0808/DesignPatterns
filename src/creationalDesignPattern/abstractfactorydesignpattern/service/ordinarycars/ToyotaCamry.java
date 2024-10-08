package creationalDesignPattern.abstractfactorydesignpattern.service.ordinarycars;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public class ToyotaCamry implements CarFactory{

    @Override
    public void printNameOfCar() {
        System.out.println("This is Toyota Camry");
    }
}
