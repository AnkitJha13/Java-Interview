package ocp;

public class Main {
    public static void main(String[] args) {
        // Using Email Notification
        Notification emailNotification = new EmailNotification();
        NotificationService emailService = new NotificationService(emailNotification);
        emailService.sendNotification("Welcome to our service!");

        // Using SMS Notification
        Notification smsNotification = new SMSNotification();
        NotificationService smsService = new NotificationService(smsNotification);
        smsService.sendNotification("Your OTP is 123456");
    }
}


// Output

// Sending Email: Welcome to our service!
// Sending SMS: Your OTP is 123456
