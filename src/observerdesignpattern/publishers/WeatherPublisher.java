package observerdesignpattern.publishers;

import observerdesignpattern.dto.TemperatureDto;
import observerdesignpattern.subscriber.DisplaySubscriber;

public interface WeatherPublisher {
    void addSubscribers(DisplaySubscriber displaySubscriber);

    void removeSubscribers(DisplaySubscriber displaySubscriber);

    void notifySubscribers();

    void setCurrentTemperature(String currentTemperature);

    TemperatureDto getTemperatureData();


}
