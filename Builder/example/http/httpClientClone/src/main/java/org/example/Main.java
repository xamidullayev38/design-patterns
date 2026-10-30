package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Abstract Factory: faqat fabrikani almashtirsak, client ham, request ham o'zgaradi
        HttpFactory factory = new JsonHttpFactory();

        Client client = factory.createClient();
        Request request = factory.createRequest()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .method(RequestMethods.GET)
                .build();

        client.send(request);

        System.out.println();

        HttpFactory textFactory = new TextHttpFactory();
        Request textRequest = textFactory.createRequest()
                .url("https://example.com")
                .method(RequestMethods.GET)
                .build();

        textFactory.createClient().send(textRequest);
    }
}
