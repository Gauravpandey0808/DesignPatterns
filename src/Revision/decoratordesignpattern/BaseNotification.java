package Revision.decoratordesignpattern;

import Revision.decoratordesignpattern.dto.NotificationRequest;
import Revision.decoratordesignpattern.enums.NotificationType;

import java.util.Set;

public abstract class BaseNotification {

    public void getNotification(NotificationRequest request) {
        System.out.println("[Requester] : "+ request.getRequester());
        Set<NotificationType> notificationType = request.getNotificationType();
        for(NotificationType type : notificationType) {
            System.out.println("[" + type +"]" + " Sending " + type + ":" + request.getNotificationMessage());
        }
    }

    public abstract NotificationRequest getNotificationRequest();
}
