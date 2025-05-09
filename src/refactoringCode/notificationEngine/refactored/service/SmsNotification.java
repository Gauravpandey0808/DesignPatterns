package refactoringCode.notificationEngine.refactored.service;

import refactoringCode.notificationEngine.refactored.dto.NotificationRequest;
public class SmsNotification extends Notification {

    @Override
    void notifyUser(String defautMessage, NotificationRequest request) {
        System.out.println("Sms " + defautMessage + request.getMessages());
    }
}
