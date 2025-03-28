package Revision.Observer.subscribers;

public interface Subscribers {

    public void notification(int cityCode, String cityName, String previousTemperature, String subscriberName, String temperature);
}
