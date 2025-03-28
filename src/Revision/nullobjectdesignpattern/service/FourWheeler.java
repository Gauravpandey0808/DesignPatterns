package Revision.nullobjectdesignpattern.service;

public class FourWheeler implements VehicleDetails {
    @Override
    public int getSeatingCapacity() {
        return 7;
    }

    @Override
    public int getFuelTankCapacity() {
        return 50;
    }
}
