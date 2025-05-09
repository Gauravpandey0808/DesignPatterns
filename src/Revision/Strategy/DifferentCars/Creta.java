package Revision.Strategy.DifferentCars;

import Revision.Strategy.CarDescription;

public class Creta implements CarDescription {
    @Override
    public String getCarName() {
        return "Hyundai";
    }

    @Override
    public String getModelName() {
        return "Creta";
    }

    @Override
    public String getPrice() {
        return "14,00,000";
    }

    @Override
    public String getEngineName() {
        return "1.5L CRDi Diesel";
    }
}
