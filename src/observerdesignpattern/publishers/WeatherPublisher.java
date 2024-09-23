package observerdesignpattern.publishers;

import observerdesignpattern.dto.TemperatureDto;
import observerdesignpattern.subscriber.DisplaySubscriber;

/**
 *
 * <h1>WeatherPublisher Interface</h1>
 * <p>This interface defines the methods required for managing the life cycle of changes
 * that need to be broadcast to observers, following the Observer design pattern,
 * across different platforms.</p>
 *
 */


public interface WeatherPublisher {
    void addSubscribers(DisplaySubscriber displaySubscriber);

    void removeSubscribers(DisplaySubscriber displaySubscriber);

    void notifySubscribers();

    void setCurrentTemperature(String currentTemperature);

    TemperatureDto getTemperatureData();


}
