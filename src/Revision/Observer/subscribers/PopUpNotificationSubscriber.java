package Revision.Observer.subscribers;

public class PopUpNotificationSubscriber implements Subscribers {
    @Override
    public void notification(int cityCode, String cityName, String previousTemperature, String subscriberName, String updatedTemperature) {
        System.out.printf("""
                This is PopUp notification
                1 The user is %s
                2. City: %s (Code: %d)
                3. Previous Temperature: %s
                4. Updated Temperature: %s%n""", subscriberName, cityName, cityCode, previousTemperature, updatedTemperature);
    }

}

