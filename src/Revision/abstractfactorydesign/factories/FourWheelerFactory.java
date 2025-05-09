package Revision.abstractfactorydesign.factories;

import Revision.abstractfactorydesign.enums.FourWheeler;
import Revision.abstractfactorydesign.vehicles.Vehicle;
import Revision.abstractfactorydesign.vehicles.fourwheeler.BMWX5;
import Revision.abstractfactorydesign.vehicles.fourwheeler.Rogue;
import Revision.abstractfactorydesign.vehicles.fourwheeler.Tacoma;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(Object vehicles) {
        FourWheeler fourWheeler = (FourWheeler) vehicles;

        return switch (fourWheeler) {
            case BMW_X5 -> new BMWX5();
            case NISSAN_ROGUE -> new Rogue();
            case TOYOTA_TACOMA -> new Tacoma();
        };
    }
}
