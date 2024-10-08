package behaviouraldesignpattern.observerdesignpattern.subscriber;

import behaviouraldesignpattern.observerdesignpattern.dto.TemperatureDto;
import behaviouraldesignpattern.observerdesignpattern.publishers.WeatherPublisher;

public class MobilePhoneSubscriber implements DisplaySubscriber {
    WeatherPublisher displayPublisher;

    public MobilePhoneSubscriber(WeatherPublisher displayPublisher) {
        this.displayPublisher = displayPublisher;

    }
    @Override
    public void stateChange() {
        TemperatureDto temperatureDto = displayPublisher.getTemperatureData();
        System.out.println("=============================================");
        System.out.println("We have notified to mobile phone Subscribers have been notified");
        System.out.println("Here is the location :"+temperatureDto.getLocation());
        System.out.println("Here is the current time "+temperatureDto.getCurrentTime());
        System.out.println("Here is the current temperature"+temperatureDto.getCurrentTemperature());
        System.out.println("=============================================");
    }
}
