package FactoryDesignPattern.NotificationFactory;
// Step 1: Define a common interface
interface Notification {
    void notifyUser();
}

// Step 2: Implement concrete classes
class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}

class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}

// Step 3: Create a Factory
class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            case "push": return new PushNotification();
            default: throw new IllegalArgumentException("Unknown notification type");
        }
    }
}

// Step 4: Client code
public class NotificationfactoryMain {
    public static void main(String[] args) {
        System.out.println("NotificationFacory Design Pattern");
        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser(); // Output: Sending an Email Notification
    }
}
