package Revision.abstractfactorydesign;

import Revision.abstractfactorydesign.enums.FourWheeler;
import Revision.abstractfactorydesign.enums.TwoWheeler;
import Revision.abstractfactorydesign.enums.VehicleType;
import Revision.abstractfactorydesign.factories.VehicleFactory;
import Revision.abstractfactorydesign.factories.VehicleTypeFactory;
import Revision.abstractfactorydesign.vehicles.Vehicle;

public class VehicleMain {

    public static void main(String[] args) {

        VehicleFactory factory1 = new VehicleTypeFactory().getVehicleFactory(VehicleType.FOUR_WHEELER);
        Vehicle vehicle =  factory1.getVehicle(FourWheeler.BMW_X5);
        vehicle.getBrand();
        vehicle.getType();

        VehicleFactory factory2 = new VehicleTypeFactory().getVehicleFactory(VehicleType.TWO_WHEELER);
        Vehicle vehicle2 =  factory2.getVehicle(TwoWheeler.ROYAL_ENFIELD);
        vehicle2.getBrand();
        vehicle2.getType();
    }
}
