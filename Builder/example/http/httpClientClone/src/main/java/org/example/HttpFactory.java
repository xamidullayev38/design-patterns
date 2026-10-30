package org.example;

// Abstract Factory: bir-biriga mos client va request juftligini yaratadi
public interface HttpFactory {
    Client createClient();

    HttpRequest.Builder createRequest();
}
