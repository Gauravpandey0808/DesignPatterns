package Revision.Observer.DummyData;

import Revision.Observer.POJO.CityTemperatureData;
import Revision.Observer.POJO.SubscribersData;
import Revision.Observer.subscribers.EmailSubscriber;
import Revision.Observer.subscribers.PopUpNotificationSubscriber;
import Revision.Observer.subscribers.SmsSubscriber;
import Revision.Observer.subscribers.Subscribers;

import java.util.*;

public class DummyDataCreation {
    public Set<CityTemperatureData> createDummyTemperatureData() {
        Set<CityTemperatureData> latestData = new HashSet<>();
        latestData.add(createCityData("Uttarakhand", "Pithoragarh", 5, "12 Degree", new HashSet<>(Arrays.asList(1, 2))));
        latestData.add(createCityData("Maharashtra", "Mumbai", 1, "30 Degree", new HashSet<>(Arrays.asList(3, 4))));
        latestData.add(createCityData("Delhi", "New Delhi", 2, "28 Degree", new HashSet<>(Arrays.asList(5, 6))));
        latestData.add(createCityData("Rajasthan", "Jaipur", 3, "25 Degree", new HashSet<>(Arrays.asList(7, 8, 3))));
        latestData.add(createCityData("Tamil Nadu", "Chennai", 4, "32 Degree", new HashSet<>(Arrays.asList(3, 2, 1))));
        return latestData;
    }

    private CityTemperatureData createCityData(String stateName, String cityName, int cityCode, String temperature, Set<Integer> subscriberId) {
        CityTemperatureData city = new CityTemperatureData();
        city.setCityCode(cityCode);
        city.setCityName(cityName);
        city.setStateName(stateName);
        city.setTemperature(temperature);
        city.setSubscriberId(subscriberId);

        return city;
    }


    public Set<SubscribersData> createDummySubscriberData() {
        Set<SubscribersData> latestSubscribersData = new HashSet<>();
        latestSubscribersData.add(createSubscriberData(1, "Sanjay", Arrays.asList(new EmailSubscriber(), new SmsSubscriber())));
        latestSubscribersData.add(createSubscriberData(2, "Gaurav", Arrays.asList(new PopUpNotificationSubscriber(), new SmsSubscriber())));
        latestSubscribersData.add(createSubscriberData(3, "Amit", Arrays.asList(new SmsSubscriber(), new PopUpNotificationSubscriber())));
        latestSubscribersData.add(createSubscriberData(4, "Ravi", Arrays.asList(new EmailSubscriber(), new PopUpNotificationSubscriber())));
        latestSubscribersData.add(createSubscriberData(5, "Neha", Arrays.asList(new SmsSubscriber(), new EmailSubscriber())));
        latestSubscribersData.add(createSubscriberData(6, "Priya", Arrays.asList(new PopUpNotificationSubscriber(), new EmailSubscriber())));
        latestSubscribersData.add(createSubscriberData(7, "Rahul", Arrays.asList(new SmsSubscriber(), new PopUpNotificationSubscriber())));
        latestSubscribersData.add(createSubscriberData(8, "Vikas", Arrays.asList(new EmailSubscriber(), new SmsSubscriber())));
        latestSubscribersData.add(createSubscriberData(9, "Arjun", Arrays.asList(new PopUpNotificationSubscriber(), new SmsSubscriber())));
        latestSubscribersData.add(createSubscriberData(10, "Pooja", Arrays.asList(new SmsSubscriber(), new EmailSubscriber())));

        return latestSubscribersData;
    }

    private SubscribersData createSubscriberData(int id, String name, List<Subscribers> subscribedChannel) {
        SubscribersData  subscriberData = new SubscribersData();
        subscriberData.setSubscribedChannel(subscribedChannel);
        subscriberData.setId(id);
        subscriberData.setName(name);

        return subscriberData;
    }
}
