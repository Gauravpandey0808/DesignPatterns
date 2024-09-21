package observerdesignpattern.subscriber;

import observerdesignpattern.dto.TemperatureDto;
import observerdesignpattern.publishers.WeatherPublisher;

public class WebApplicationSubscriber implements DisplaySubscriber {
    WeatherPublisher displayPublisher;

    public WebApplicationSubscriber(WeatherPublisher displayPublisher) {
        this.displayPublisher = displayPublisher;

    }
    @Override
    public void stateChange() {
        TemperatureDto temperatureDto = displayPublisher.getTemperatureData();
        System.out.println("=============================================");
        System.out.println("We have notified to  Web Application Subscribers");
        System.out.println("Here is the location :"+temperatureDto.getLocation());
        System.out.println("Here is the current time "+temperatureDto.getCurrentTime());
        System.out.println("Here is the current temperature"+temperatureDto.getCurrentTemperature());
        System.out.println("=============================================");
    }
}