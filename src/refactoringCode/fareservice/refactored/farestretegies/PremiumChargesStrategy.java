package refactoringCode.fareservice.refactored.farestretegies;

import refactoringCode.fareservice.refactored.dto.RiderRequest;

public class PremiumChargesStrategy implements FareCalculatorStrategy{
    private final int FIXED_CHARGE = 20;
    @Override
    public double calculateFare(RiderRequest request) {
        return FIXED_CHARGE * request.getDistanceInKm() + 2 * request.getDurationInMin() + 50;
    }
}
