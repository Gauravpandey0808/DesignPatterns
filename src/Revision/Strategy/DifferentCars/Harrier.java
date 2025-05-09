package Revision.Strategy.DifferentCars;

import Revision.Strategy.CarDescription;

public class Harrier implements CarDescription {
    @Override
    public String getCarName() {
        return "Tata";
    }

    @Override
    public String getModelName() {
        return "Harrier";
    }

    @Override
    public String getPrice() {
        return "22,00,000";
    }

    @Override
    public String getEngineName() {
        return "2.0L Kryotec Diesel";
    }
}
