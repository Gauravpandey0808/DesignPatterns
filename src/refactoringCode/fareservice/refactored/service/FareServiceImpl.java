package refactoringCode.fareservice.refactored.service;

import refactoringCode.fareservice.refactored.dto.RiderRequest;
import refactoringCode.fareservice.refactored.enums.RideCategory;
import refactoringCode.fareservice.refactored.farestretegies.FareCalculatorStrategy;
import refactoringCode.fareservice.refactored.farestretegies.PoolChargesStrategy;
import refactoringCode.fareservice.refactored.farestretegies.PremiumChargesStrategy;
import refactoringCode.fareservice.refactored.farestretegies.StandardChargesStrategy;

public class FareServiceImpl {

    public double calculateFare(RiderRequest request) {
        return getFareStrategy(request.getRideCategory()).calculateFare(request);
    }


    public FareCalculatorStrategy getFareStrategy(RideCategory category) {
        return switch(category) {
            case STANDARD -> new StandardChargesStrategy();
            case PREMIUM -> new PremiumChargesStrategy();
            case POOL -> new PoolChargesStrategy();
        };
    }
}
