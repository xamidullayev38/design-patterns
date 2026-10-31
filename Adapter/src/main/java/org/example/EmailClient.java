package org.example;

public class EmailClient {
    public void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Email -> " + emailAddress + " [" + subject + "]: " + body);
    }
}
