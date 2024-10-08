package creationalDesignPattern.abstractfactorydesignpattern.service.luxurycars;

import creationalDesignPattern.abstractfactorydesignpattern.service.CarFactory;

public class MercedesBenzSClass implements CarFactory {
    @Override
    public void printNameOfCar() {
        System.out.println("This is Mercedes Benz S class");
    }
}
