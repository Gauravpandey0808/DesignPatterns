package refactoringCode.notificationEngine.refactored.service;

import refactoringCode.notificationEngine.refactored.dto.NotificationRequest;
import refactoringCode.notificationEngine.refactored.enums.UserType;
import static refactoringCode.notificationEngine.refactored.constants.NotificationConstants.ADMIN_EMAIL_PREFIX;
import static refactoringCode.notificationEngine.refactored.constants.NotificationConstants.USER_EMAIL_PREFIX;

public abstract class Notification {
    void notifier(NotificationRequest request) {
        String defaultMsg = request.getCurrentUser() == UserType.ADMIN ? ADMIN_EMAIL_PREFIX : USER_EMAIL_PREFIX;
        notifyUser(defaultMsg, request);
    }
    abstract void notifyUser(String defautMessage, NotificationRequest request);
}
