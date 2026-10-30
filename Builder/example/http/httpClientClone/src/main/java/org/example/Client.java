package org.example;

import java.io.IOException;

public interface Client {
    void send(Request request) throws IOException;
}
