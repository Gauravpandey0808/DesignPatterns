package refactoringCode.notificationEngine.nonrefactored;

public class NotificationEngine {
    public void trigger(String userType, String channel, String message) {
        if (userType != null && channel != null && message != null && !message.isEmpty()) {
            if (userType.equals("ADMIN")) {
                if (channel.equals("EMAIL")) {
                    System.out.println("Admin Email: " + message);
                } else if (channel.equals("SMS")) {
                    System.out.println("Admin SMS: " + message);
                }
            } else if (userType.equals("USER")) {
                if (channel.equals("EMAIL")) {
                    System.out.println("User Email: " + message);
                } else {
                        System.out.println("User Default Channel: " + message);
                }
            } else {
                System.out.println("Unsupported User Type");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
