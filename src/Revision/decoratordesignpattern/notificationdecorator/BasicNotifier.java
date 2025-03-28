package Revision.decoratordesignpattern.notificationdecorator;

import Revision.decoratordesignpattern.BaseNotification;
import Revision.decoratordesignpattern.dto.NotificationRequest;
import Revision.decoratordesignpattern.enums.NotificationType;

public class BasicNotifier extends BaseNotification {
    private NotificationRequest request;
    public BasicNotifier(String requester, String message) {
        this.request = new NotificationRequest(requester, message);
    }

    @Override
    public NotificationRequest getNotificationRequest() {
        this.request.setNotificationType(NotificationType.BASIC);
        return this.request;
    }
}
