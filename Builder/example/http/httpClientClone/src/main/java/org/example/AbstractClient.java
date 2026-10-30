package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.StandardCharsets;

public abstract class AbstractClient implements Client {

    @Override
    public void send(Request request) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) URI.create(request.getUrl()).toURL().openConnection();
        connection.setRequestMethod(request.getMethod().name());
        request.getHeaders().forEach(connection::setRequestProperty);

        if (request.getBody() != null) {
            connection.setDoOutput(true);
            try (OutputStream out = connection.getOutputStream()) {
                out.write(request.getBody().getBytes(StandardCharsets.UTF_8));
            }
        }

        int status = connection.getResponseCode();
        InputStream in = status >= 400 ? connection.getErrorStream() : connection.getInputStream();
        String body = in == null ? "" : new String(in.readAllBytes(), StandardCharsets.UTF_8);
        connection.disconnect();

        System.out.println("Status: " + status);
        print(body);
    }

    protected abstract void print(String body);
}
