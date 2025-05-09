package refactoringCode.fareservice.refactored.farestretegies;

import refactoringCode.fareservice.refactored.dto.RiderRequest;

public class PoolChargesStrategy implements FareCalculatorStrategy{
    private final int FIXED_CHARGE = 8;
    @Override
    public double calculateFare(RiderRequest request) {
        return FIXED_CHARGE * request.getDistanceInKm() + 0.5 * request.getDurationInMin();
    }
}
