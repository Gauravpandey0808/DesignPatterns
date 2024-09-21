package observerdesignpattern.publishers;

import observerdesignpattern.dto.TemperatureDto;
import observerdesignpattern.subscriber.DisplaySubscriber;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;



public class WeatherPublisherImpl implements WeatherPublisher {

    Set<DisplaySubscriber> subscribers = new HashSet<>();

    TemperatureDto temperatureDto;

    public WeatherPublisherImpl(TemperatureDto temperatureDto) {
        this.temperatureDto = temperatureDto;
    }



    @Override
    public void addSubscribers(DisplaySubscriber displaySubscriber) {
        subscribers.add(displaySubscriber);

    }

    @Override
    public void removeSubscribers(DisplaySubscriber displaySubscriber) {
        subscribers.remove(displaySubscriber);

    }

    @Override
    public void notifySubscribers() {
        for (DisplaySubscriber currentSubscriber : subscribers) {
            currentSubscriber.stateChange();
        }

    }
    @Override
    public void setCurrentTemperature(String currentTemperature) {
        temperatureDto.setCurrentTemperature(currentTemperature);
        temperatureDto.setCurrentTime(LocalDateTime.now());
        notifySubscribers();
    }

    @Override
    public TemperatureDto getTemperatureData() {
        return this.temperatureDto;
    }
}
