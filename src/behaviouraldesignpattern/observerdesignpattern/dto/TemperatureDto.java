package behaviouraldesignpattern.observerdesignpattern.dto;


import java.time.LocalDateTime;

public class TemperatureDto {

    private String location;
    private String currentTemperature;

    public TemperatureDto(String location) {
        this.location = location;
    }

    private LocalDateTime currentTime;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(String currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }


}
