package Revision.Observer.POJO;

import Revision.Observer.subscribers.Subscribers;

import java.util.List;

public class SubscribersData {

    int id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subscribers> getSubscribedChannel() {
        return subscribedChannel;
    }

    public void setSubscribedChannel(List<Subscribers> subscribedChannel) {
        this.subscribedChannel = subscribedChannel;
    }

    List<Subscribers> subscribedChannel;


}
