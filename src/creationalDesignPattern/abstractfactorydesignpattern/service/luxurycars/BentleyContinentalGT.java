package creationalDesignPattern.abstractfactorydesignpattern.service.luxurycars;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public class BentleyContinentalGT implements CarFactory {
    @Override
    public void printNameOfCar() {
        System.out.println("This is bentley continental Gt");
    }
}
