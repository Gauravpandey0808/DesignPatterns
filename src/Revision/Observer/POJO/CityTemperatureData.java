package Revision.Observer.POJO;

import java.util.Set;

public class CityTemperatureData {

    String stateName;

    String cityName;

    int cityCode;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Set<Integer> getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Set<Integer> subscriberId) {
        this.subscriberId = subscriberId;
    }

    String temperature;

    Set<Integer> subscriberId;

}
