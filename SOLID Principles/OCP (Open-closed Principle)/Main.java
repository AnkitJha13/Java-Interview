package ocp;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        NotificationService emailService = new NotificationService(emailNotification);
        emailService.sendNotification("Welcome to our service!");
        Notification smsNotification = new SMSNotification();
        NotificationService smsService = new NotificationService(smsNotification);
        smsService.sendNotification("Your OTP is 123456");
    }
}

// Output

// Sending Email: Welcome to our service!
// Sending SMS: Your OTP is 123456
