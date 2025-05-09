package Revision.decoratordesignpattern.dto;

import Revision.decoratordesignpattern.enums.NotificationType;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class NotificationRequest {

    private String requester;
    private String notificationMessage;
    private Set<NotificationType> notificationType;

    public NotificationRequest(String requester, String message) {
        this.notificationMessage = message;
        this.requester = requester;
        this.notificationType = new HashSet<>();
    }

    public void setNotificationType(NotificationType type) {
        notificationType.add(type);
    }
}
