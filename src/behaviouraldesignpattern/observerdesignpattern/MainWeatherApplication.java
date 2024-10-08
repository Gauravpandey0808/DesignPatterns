package behaviouraldesignpattern.observerdesignpattern;

import behaviouraldesignpattern.observerdesignpattern.dto.TemperatureDto;
import behaviouraldesignpattern.observerdesignpattern.publishers.WeatherPublisher;
import behaviouraldesignpattern.observerdesignpattern.publishers.WeatherPublisherImpl;
import behaviouraldesignpattern.observerdesignpattern.subscriber.DisplaySubscriber;
import behaviouraldesignpattern.observerdesignpattern.subscriber.EmailSubscriber;
import behaviouraldesignpattern.observerdesignpattern.subscriber.MobilePhoneSubscriber;
import behaviouraldesignpattern.observerdesignpattern.subscriber.WebApplicationSubscriber;

/**
 * <h1>Observer Design Pattern: Weather Application</h1>
 * <p>This application demonstrates the Observer Design Pattern, which establishes a one-to-many
 * relationship between a Subject (Publisher) and its Observers (Subscribers). When the Subject’s
 * state changes, all registered Observers are notified.
 * </p>
 *
 * <p>We use a weather application to model this pattern. In a real-world scenario, the weather data
 * could come from an API or a Kafka topic, but for this example, we manually update the data.</p>
 *
 * <p>The application is organized into three packages under <b>observedesignpattern</b>:</p>
 *
 * <ul>
 *     <li>
 *         <b>publishers</b>: This package contains the Subject in the Observer Pattern. The Publisher manages
 *         the lifecycle of Observers (Subscribers) and notifies them when its state changes.
 *         <ul>
 *             <li>
 *                 <b>WeatherPublisher</b>: An interface that defines the methods required for managing the lifecycle of Observers,
 *                 including methods to add, remove, and notify Observers.
 *             </li>
 *             <li>
 *                 <b>WeatherPublisherImpl</b>: A concrete implementation of the <b>WeatherPublisher</b> interface. It stores the list
 *                 of Observers and manages notifications when weather data is updated.
 *             </li>
 *         </ul>
 *     </li>
 *     <li>
 *         <b>subscribers</b>: This package contains the concrete Observers (Subscribers) that listen for updates from the Publisher.
 *         In this case, we use different subscribers that react to weather data updates:
 *         <ul>
 *             <li><b>MobilePhoneSubscribers</b></li>
 *             <li><b>WebApplicationSubscribers</b></li>
 *             <li><b>EmailSubscribers</b></li>
 *         </ul>
 *     </li>
 *     <li>
 *         <b>dto</b>: This package contains Data Transfer Objects (DTOs) for weather-related data. Specifically,
 *         it includes the <b>TemperatureDto</b>, which encapsulates temperature information passed between the Publisher and Subscribers.
 *     </li>
 * </ul>
 */


public class MainWeatherApplication {
    public static void main(String[] args) {
        TemperatureDto temperatureDto = new TemperatureDto("Pithoragarh");
        WeatherPublisher weatherPublisher = new WeatherPublisherImpl(temperatureDto);

        DisplaySubscriber mobileSubscribers = new MobilePhoneSubscriber(weatherPublisher);
        DisplaySubscriber emailSubscribers = new EmailSubscriber(weatherPublisher);

        weatherPublisher.addSubscribers(mobileSubscribers);
        weatherPublisher.addSubscribers(emailSubscribers);
        weatherPublisher.setCurrentTemperature("20 degrees");

        weatherPublisher.removeSubscribers(mobileSubscribers);
        weatherPublisher.setCurrentTemperature("30 degrees");

        DisplaySubscriber webApplicationSubscribers = new WebApplicationSubscriber(weatherPublisher);
        weatherPublisher.addSubscribers(webApplicationSubscribers);
        weatherPublisher.setCurrentTemperature("40 degrees");
    }
}
