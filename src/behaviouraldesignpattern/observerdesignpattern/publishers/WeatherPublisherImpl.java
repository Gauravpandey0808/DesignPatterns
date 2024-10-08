package behaviouraldesignpattern.observerdesignpattern.publishers;

import behaviouraldesignpattern.observerdesignpattern.dto.TemperatureDto;
import behaviouraldesignpattern.observerdesignpattern.subscriber.DisplaySubscriber;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * <h1>WeatherPublisherImpl Concrete Class</h1>
 * <p>This class implements the {@link WeatherPublisher} interface.</p>
 * <p>It manages the entire life cycle of changes, including broadcasting updates,
 * adding and removing subscribers, notifying subscribers, and retrieving updated data.</p>
 *
 */

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
