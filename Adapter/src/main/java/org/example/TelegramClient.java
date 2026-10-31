package org.example;

public class TelegramClient {
    public void sendTelegramMessage(String chatId, String text) {
        System.out.println("Telegram -> " + chatId + ": " + text);
    }
}
