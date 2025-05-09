package Revision.decoratordesignpattern;

import Revision.decoratordesignpattern.dto.NotificationRequest;
import Revision.decoratordesignpattern.notificationdecorator.BasicNotifier;
import Revision.decoratordesignpattern.notificationdecorator.SMSNotifier;

public class NotificationMain {

    public static void main(String[] args) {


        BaseNotification notification = new BasicNotifier("Gaurav Pandey", "Server Down!");
        NotificationRequest basicRequest = notification.getNotificationRequest();

        BaseNotification smsNotification = new SMSNotifier(basicRequest);
        smsNotification.getNotification(smsNotification.getNotificationRequest());
    }
}
