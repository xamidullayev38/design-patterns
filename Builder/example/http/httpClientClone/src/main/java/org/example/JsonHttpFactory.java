package org.example;

public class JsonHttpFactory implements HttpFactory {

    @Override
    public Client createClient() {
        return new JsonClient();
    }

    @Override
    public HttpRequest.Builder createRequest() {
        return HttpRequest.builder()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json");
    }
}
