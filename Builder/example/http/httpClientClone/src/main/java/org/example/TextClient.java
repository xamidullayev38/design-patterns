package org.example;

public class TextClient extends AbstractClient {

    @Override
    protected void print(String body) {
        System.out.println("Matn javob (birinchi 200 belgi):");
        System.out.println(body.length() > 200 ? body.substring(0, 200) + "..." : body);
    }
}
