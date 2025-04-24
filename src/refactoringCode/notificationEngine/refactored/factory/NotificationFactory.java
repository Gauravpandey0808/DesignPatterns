package refactoringCode.notificationEngine.refactored.factory;

import refactoringCode.notificationEngine.refactored.enums.Channel;
import refactoringCode.notificationEngine.refactored.service.EmailNotification;
import refactoringCode.notificationEngine.refactored.service.Notification;
import refactoringCode.notificationEngine.refactored.service.SmsNotification;

public class NotificationFactory {

    public Notification getNotification(Channel channel) {
        return switch (channel) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SmsNotification();
        };
    }
}
