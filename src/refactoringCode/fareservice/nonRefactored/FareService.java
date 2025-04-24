package refactoringCode.fareservice.nonRefactored;

public class FareService {
    public double calculateFare(String rideType, double distanceInKm, int durationInMin) {
        if ("STANDARD".equalsIgnoreCase(rideType)) {
            return 10 * distanceInKm + 1 * durationInMin;
        } else if ("PREMIUM".equalsIgnoreCase(rideType)) {
            return 20 * distanceInKm + 2 * durationInMin + 50;
        } else if ("POOL".equalsIgnoreCase(rideType)) {
            return 8 * distanceInKm + 0.5 * durationInMin;
        } else {
            throw new IllegalArgumentException("Unsupported ride type");
        }
    }
}
