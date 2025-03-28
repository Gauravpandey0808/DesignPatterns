package Revision.abstractfactorydesign.factories;

import Revision.abstractfactorydesign.enums.TwoWheeler;
import Revision.abstractfactorydesign.vehicles.Vehicle;
import Revision.abstractfactorydesign.vehicles.twowheeler.Ather;
import Revision.abstractfactorydesign.vehicles.twowheeler.RoyalEnfield;
import Revision.abstractfactorydesign.vehicles.twowheeler.Vespa;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(Object vehicles) {
        final TwoWheeler twoWheeler = (TwoWheeler) vehicles;
        return switch (twoWheeler) {
            case ROYAL_ENFIELD -> new RoyalEnfield();
            case VESPA -> new Vespa();
            case ATHER_450X -> new Ather();
        };
    }
}
