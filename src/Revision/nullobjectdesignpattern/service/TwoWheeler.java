package Revision.nullobjectdesignpattern.service;

public class TwoWheeler implements VehicleDetails {
    @Override
    public int getSeatingCapacity() {
        return 2;
    }

    @Override
    public int getFuelTankCapacity() {
        return 6;
    }
}
