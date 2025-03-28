package Revision.decoratordesignpattern.notificationdecorator;

import Revision.decoratordesignpattern.BaseNotification;
import Revision.decoratordesignpattern.dto.NotificationRequest;
import Revision.decoratordesignpattern.enums.NotificationType;

public class SMSNotifier extends BaseNotification {
    private  NotificationRequest request;

    public SMSNotifier(NotificationRequest request) {
        this.request = request;
    }

    public NotificationRequest getNotificationRequest() {
        this.request.setNotificationType(NotificationType.SMS);
        return this.request;
    }
}