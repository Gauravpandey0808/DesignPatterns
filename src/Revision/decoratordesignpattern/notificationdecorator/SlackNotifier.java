package Revision.decoratordesignpattern.notificationdecorator;

import Revision.decoratordesignpattern.BaseNotification;
import Revision.decoratordesignpattern.dto.NotificationRequest;
import Revision.decoratordesignpattern.enums.NotificationType;

public class SlackNotifier extends BaseNotification {
    private NotificationRequest request;

    public SlackNotifier(NotificationRequest request) {
        this.request = request;
    }

    public NotificationRequest getNotificationRequest() {
        this.request.setNotificationType(NotificationType.SLACK);
        return this.request;
    }
}