package refactoringCode.notificationEngine.refactored.service;

import refactoringCode.notificationEngine.refactored.dto.NotificationRequest;
import refactoringCode.notificationEngine.refactored.enums.Channel;
import refactoringCode.notificationEngine.refactored.enums.UserType;
import refactoringCode.notificationEngine.refactored.factory.NotificationFactory;
import java.util.List;
import static refactoringCode.notificationEngine.refactored.constants.NotificationConstants.*;

public class NotificationServiceImpl {

    private final NotificationFactory factory;
    private final NotificationRequest request;

    NotificationServiceImpl() {
        factory = new NotificationFactory();
        request = new NotificationRequest();
    }

    public void triggerNotification(String userType, String channel, String message) throws Exception {
        Notification notification = factory.getNotification(getChannel(userType, channel));
        buildNotificationRequest(userType, message);
        notification.notifier(request);


    }

    private Channel getChannel(String userType , String channel) {
        Channel defaultChannel = userType.equals(ADMIN) ? ADMIN_DEFAULT_CHANNEL:USER_DEFAULT_CHANNEL;
        return switch(channel) {
            case SMS_NOTIFICATION -> Channel.SMS;
            case EMAIL_NOTIFICATION -> Channel.EMAIL;
            default -> defaultChannel;
        };
    }

    private UserType getUser(String userType) throws Exception {
        return switch (userType.toUpperCase()) {
            case ADMIN -> UserType.ADMIN;
            case USER ->  UserType.USER;
            default -> throw  new Exception(UNSUPPORTED_USER_TYPE);
        };
    }

    private void buildNotificationRequest(String userType, String message) throws Exception {
        request.setCurrentUser(getUser(userType));
        request.setMessages(List.of(message));
    }
}
