package Revision.nullobjectdesignpattern.factory;

import Revision.nullobjectdesignpattern.service.FourWheeler;
import Revision.nullobjectdesignpattern.service.NullWheeler;
import Revision.nullobjectdesignpattern.service.TwoWheeler;
import Revision.nullobjectdesignpattern.service.VehicleDetails;

public class VehicleDetailFactory {

    public VehicleDetails getVehicleObject(String vehicleType) {
        return switch(vehicleType.toUpperCase()) {
            case "TWOWHEELER" -> new TwoWheeler();
            case "FOURWHEELER" -> new FourWheeler();
            default -> new NullWheeler();
        };
    }
}
