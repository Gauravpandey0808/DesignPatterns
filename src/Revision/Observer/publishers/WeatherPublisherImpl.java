package Revision.Observer.publishers;

import Revision.Observer.POJO.CityTemperatureData;
import Revision.Observer.POJO.SubscribersData;
import Revision.Observer.subscribers.Subscribers;
import java.util.Set;

public class WeatherPublisherImpl implements WeatherPublishers {
    Set<SubscribersData> latestSubscribersData;
    Set<CityTemperatureData> latestTempData;


    public WeatherPublisherImpl(Set<SubscribersData> latestSubscribersData, Set<CityTemperatureData> latestTempData) {
        this.latestSubscribersData = latestSubscribersData;
        this.latestTempData = latestTempData;
    }


    @Override
    public void addSubscribers(Subscribers currentSubscriber, int subscriberId, String cityName) {
        for (SubscribersData currentData : latestSubscribersData) {
            if (subscriberId == currentData.getId()) {
                currentData.getSubscribedChannel().add(currentSubscriber);
            }
        }
    }

    @Override
    public void removeSubscribers(Subscribers currentSubscriber, int subscriberId, String cityName) {
        for (SubscribersData currentData : latestSubscribersData) {
            if (subscriberId == currentData.getId()) {
                currentData.getSubscribedChannel().removeIf(subscriber -> subscriber.equals(currentSubscriber));
            }
        }
    }

    @Override
    public void notifySubscribers(int cityCode, String temperature) {
        for (CityTemperatureData cityLatestData : latestTempData) {
            if (cityCode == cityLatestData.getCityCode()) {
                Set<Integer> subscriberId = cityLatestData.getSubscriberId();

                for (SubscribersData currentSubscriberData : latestSubscribersData) {
                    for (Integer subId : subscriberId) {
                        if (currentSubscriberData.getId() == subId) {
                            for (Subscribers currentSubscribedChannel : currentSubscriberData.getSubscribedChannel()) {
                                currentSubscribedChannel.notification(cityCode, cityLatestData.getCityName(), cityLatestData.getTemperature(), currentSubscriberData.getName(), temperature);
                            }
                        }
                    }
                }
                cityLatestData.setTemperature(temperature);
            }
        }
    }

    @Override
    public void getCurrentTemperature(String cityName) {

    }
}
