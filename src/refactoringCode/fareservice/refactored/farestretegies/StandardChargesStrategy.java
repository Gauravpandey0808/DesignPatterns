package refactoringCode.fareservice.refactored.farestretegies;

import refactoringCode.fareservice.refactored.dto.RiderRequest;

public class StandardChargesStrategy implements FareCalculatorStrategy{

    private final int FIXED_CHARGE = 10;
    @Override
    public double calculateFare(RiderRequest request) {
        return FIXED_CHARGE * request.getDistanceInKm() + request.getDurationInMin();
    }
}
