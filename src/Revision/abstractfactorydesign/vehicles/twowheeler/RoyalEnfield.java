package Revision.abstractfactorydesign.vehicles.twowheeler;

import Revision.abstractfactorydesign.enums.VehicleType;
import Revision.abstractfactorydesign.vehicles.Vehicle;

public class RoyalEnfield implements Vehicle {
    @Override
    public void getType() {
        System.out.println("Vehicle Type: " + VehicleType.TWO_WHEELER);
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Royal Enfield" );
    }
}
