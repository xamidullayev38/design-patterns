package org.example;

public class Main {
    public static void main(String[] args) {
        new NotificationManager(new SmsNotificationService())
                .notify("+998901234567", "Salom SMS orqali!");

        new NotificationManager(new TelegramAdapter(new TelegramClient()))
                .notify("123456789", "Salom Telegram orqali!");

        new NotificationManager(new EmailAdapter(new EmailClient()))
                .notify("user@mail.com", "Salom Email orqali!");
    }
}
