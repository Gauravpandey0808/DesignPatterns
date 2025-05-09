package Revision.nullobjectdesignpattern;

import Revision.nullobjectdesignpattern.factory.VehicleDetailFactory;
import Revision.nullobjectdesignpattern.service.VehicleDetails;

public class VehicleMain {

    public static void main(String[] args) {

        VehicleDetailFactory factory1 = new VehicleDetailFactory();
        VehicleDetails vehicleDetails  =factory1.getVehicleObject("ThreeWheeler");
        System.out.println(vehicleDetails.getSeatingCapacity());
    }
}
