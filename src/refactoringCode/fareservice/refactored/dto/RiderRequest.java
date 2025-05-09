package refactoringCode.fareservice.refactored.dto;

import lombok.Data;
import refactoringCode.fareservice.refactored.enums.RideCategory;

@Data
public class RiderRequest {

    private RideCategory rideCategory;
    private double  distanceInKm;
    private int durationInMin;
}
