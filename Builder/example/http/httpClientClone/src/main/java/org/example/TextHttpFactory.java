package org.example;

public class TextHttpFactory implements HttpFactory {

    @Override
    public Client createClient() {
        return new TextClient();
    }

    @Override
    public HttpRequest.Builder createRequest() {
        return HttpRequest.builder()
                .header("Accept", "text/plain");
    }
}
