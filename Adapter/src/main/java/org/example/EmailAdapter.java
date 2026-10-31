package org.example;

public class EmailAdapter implements NotificationService {
    private final EmailClient client;

    public EmailAdapter(EmailClient client) {
        this.client = client;
    }

    @Override
    public void send(String recipient, String message) {
        client.sendEmail(recipient, "Bildirishnoma", message);
    }
}
