package org.example;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS -> " + recipient + ": " + message);
    }
}
