package Revision.Observer.publishers;

import Revision.Observer.subscribers.Subscribers;

public interface WeatherPublishers {

    public void addSubscribers(Subscribers currentSubscriber, int subscriberId, String cityName);

    public void removeSubscribers(Subscribers currentSubscriber, int subscriberId, String cityName);

    public void notifySubscribers(int cityCode, String temperature);

    public void getCurrentTemperature(String cityName);
}
