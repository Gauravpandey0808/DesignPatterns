package refactoringCode.notificationEngine.refactored.dto;

import lombok.Getter;
import lombok.Setter;
import refactoringCode.notificationEngine.refactored.enums.UserType;

import java.util.List;

@Getter
@Setter
public class NotificationRequest {
    List<String> messages;
    UserType currentUser;
}
