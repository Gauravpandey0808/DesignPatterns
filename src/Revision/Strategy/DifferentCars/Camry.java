package Revision.Strategy.DifferentCars;

import Revision.Strategy.CarDescription;

public class Camry implements CarDescription {
    @Override
    public String getCarName() {
        return "Toyota";
    }

    @Override
    public String getModelName() {
        return "Camry";
    }

    @Override
    public String getPrice() {
        return "5000000";
    }

    @Override
    public String getEngineName() {
        return "2.5L 4-Cylinder Hybrid";
    }
}
