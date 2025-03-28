package Revision.Observer;

import Revision.Observer.DummyData.DummyDataCreation;
import Revision.Observer.POJO.CityTemperatureData;
import Revision.Observer.POJO.SubscribersData;
import Revision.Observer.publishers.WeatherPublisherImpl;
import Revision.Observer.publishers.WeatherPublishers;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {
        DummyDataCreation dummyDataCreation = new DummyDataCreation();
        Set<SubscribersData> latestSubscribersData = dummyDataCreation.createDummySubscriberData();
        Set<CityTemperatureData> latestTempData= dummyDataCreation.createDummyTemperatureData();

        WeatherPublishers publishers = new WeatherPublisherImpl(latestSubscribersData, latestTempData);

        publishers.notifySubscribers(1, "25 degree" );
    }







}
