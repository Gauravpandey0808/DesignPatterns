package refactoringCode.notificationEngine.refactored.constants;

import refactoringCode.notificationEngine.refactored.enums.Channel;

public class NotificationConstants {


    public static final String INVALID_INPUT = "Invalid input";
    public static final String UNSUPPORTED_USER_TYPE = "Unsupported User Type";
    public static final String ADMIN_EMAIL_PREFIX = "to Admin: ";
    public static final String USER_EMAIL_PREFIX = "to User: ";

    public static final Channel USER_DEFAULT_CHANNEL = Channel.SMS;
    public static final Channel ADMIN_DEFAULT_CHANNEL = Channel.EMAIL;

    public static final String SMS_NOTIFICATION = "SMS";
    public static final String EMAIL_NOTIFICATION = "EMAIL";

    public static final String ADMIN = "ADMIN";
    public static final String USER = "USER";


    private NotificationConstants() {}
}
