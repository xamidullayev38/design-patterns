package org.example;

public class NotificationManager {
    private final NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void notify(String recipient, String message) {
        service.send(recipient, message);
    }
}
