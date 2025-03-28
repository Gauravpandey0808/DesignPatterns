package Revision.Strategy;

public class Car {
    public String getCompanyName(CarDescription description) {
        return description.getCarName();
    }

    public String getCarName(CarDescription description) {
        return description.getModelName();
    }

    public String getCostOfCar(CarDescription description) {
        return description.getPrice();
    }

    public String getEngineName(CarDescription description) {
        return description.getEngineName();
    }
}
