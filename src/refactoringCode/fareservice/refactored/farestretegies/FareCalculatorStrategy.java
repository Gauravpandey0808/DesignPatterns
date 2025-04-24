package refactoringCode.fareservice.refactored.farestretegies;

import refactoringCode.fareservice.refactored.dto.RiderRequest;

public interface FareCalculatorStrategy {

    double calculateFare(RiderRequest request);

}
