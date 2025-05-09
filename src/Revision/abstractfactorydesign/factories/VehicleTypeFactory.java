package Revision.abstractfactorydesign.factories;

import Revision.abstractfactorydesign.enums.VehicleType;

public class VehicleTypeFactory {

    public VehicleFactory getVehicleFactory(VehicleType type) throws IllegalArgumentException {
        return switch (type) {
            case FOUR_WHEELER -> new FourWheelerFactory();
            case TWO_WHEELER -> new TwoWheelerFactory();
            default -> throw new IllegalArgumentException("No such wheeler is available");
        };
    }
}
