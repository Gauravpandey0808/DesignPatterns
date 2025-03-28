package Revision.nullobjectdesignpattern.service;

public class NullWheeler implements VehicleDetails {
    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getFuelTankCapacity() {
        return 0;
    }
}
