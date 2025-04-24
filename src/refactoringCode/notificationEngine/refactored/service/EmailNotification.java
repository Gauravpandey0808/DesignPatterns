package refactoringCode.notificationEngine.refactored.service;

import refactoringCode.notificationEngine.refactored.dto.NotificationRequest;

public class EmailNotification extends Notification {
    @Override
    void notifyUser(String defautMessage, NotificationRequest request) {
        System.out.println("Email" + defautMessage + request.getMessages());
    }
}
