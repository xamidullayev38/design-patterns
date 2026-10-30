package org.example;

public class JsonClient extends AbstractClient {

    @Override
    protected void print(String body) {
        System.out.println("JSON javob:");
        System.out.println(body);
    }
}
