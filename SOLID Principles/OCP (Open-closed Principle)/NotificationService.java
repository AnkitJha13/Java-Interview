package ocp;

public class NotificationService {
    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification; // Dependency Injection
    }

    public void sendNotification(String message) {
        notification.send(message);
    }
}
