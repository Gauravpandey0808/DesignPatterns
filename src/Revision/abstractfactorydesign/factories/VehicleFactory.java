package Revision.abstractfactorydesign.factories;

import Revision.abstractfactorydesign.vehicles.Vehicle;

public interface VehicleFactory {

    Vehicle getVehicle(Object vehicles);
}
