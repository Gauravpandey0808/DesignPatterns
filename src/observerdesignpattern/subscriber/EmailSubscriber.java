package observerdesignpattern.subscriber;

import observerdesignpattern.dto.TemperatureDto;
import observerdesignpattern.publishers.WeatherPublisher;

public class EmailSubscriber implements DisplaySubscriber {
    WeatherPublisher displayPublisher;

    public EmailSubscriber(WeatherPublisher displayPublisher) {
        this.displayPublisher = displayPublisher;

    }
    @Override
    public void stateChange() {
        TemperatureDto temperatureDto = displayPublisher.getTemperatureData();
        System.out.println("=============================================");
        System.out.println("The Email Subscribers have been notified");
        System.out.println("Here is the location :"+temperatureDto.getLocation());
        System.out.println("Here is the current time "+temperatureDto.getCurrentTime());
        System.out.println("Here is the current temperature"+temperatureDto.getCurrentTemperature());
        System.out.println("=============================================");
    }
}
