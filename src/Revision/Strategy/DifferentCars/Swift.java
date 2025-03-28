package Revision.Strategy.DifferentCars;

import Revision.Strategy.CarDescription;

public class Swift implements CarDescription {
    @Override
    public String getCarName() {
        return "Maruti";
    }

    @Override
    public String getModelName() {
        return "Swift";
    }

    @Override
    public String getPrice() {
        return "8,50,000";
    }

    @Override
    public String getEngineName() {
        return "1.2L K-Series Petrol";
    }
}
