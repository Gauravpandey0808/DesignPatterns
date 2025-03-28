package Revision.abstractfactorydesign.vehicles.fourwheeler;

import Revision.abstractfactorydesign.enums.VehicleType;
import Revision.abstractfactorydesign.vehicles.Vehicle;

public class Rogue implements Vehicle {
    @Override
    public void getType() {
        System.out.println("Vehicle Type: " + VehicleType.FOUR_WHEELER);
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Nissan Car" );
    }
}
