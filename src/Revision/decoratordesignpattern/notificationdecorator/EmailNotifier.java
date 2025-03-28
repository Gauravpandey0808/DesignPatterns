package Revision.decoratordesignpattern.notificationdecorator;

import Revision.decoratordesignpattern.BaseNotification;
import Revision.decoratordesignpattern.dto.NotificationRequest;
import Revision.decoratordesignpattern.enums.NotificationType;

public class EmailNotifier extends BaseNotification {
    private NotificationRequest request;
    public EmailNotifier(NotificationRequest request) {
        this.request = request;
    }

    public NotificationRequest getNotificationRequest() {
        this.request.setNotificationType(NotificationType.EMAIL);
        return this.request;
    }
}