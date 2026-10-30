package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document original = new Document(
                1,
                "Shartnoma",
                "Shartnoma matni...",
                "Said",
                List.of("ish", "hujjat")
        );

        DocumentFactory factory = new DocumentFactory(original);

        Document copy1 = factory.cloneDocument();
        copy1.setTitle("Shartnoma-1");
        copy1.setContent("Birinchi nusxa matni");
        copy1.getTags().add("nusxa-1");

        Document copy2 = factory.cloneDocument();
        copy2.setTitle("Shartnoma-2");
        copy2.setContent("Ikkinchi nusxa matni");
        copy2.getTags().add("nusxa-2");

        System.out.println(original);
        System.out.println(copy1);
        System.out.println(copy2);
    }
}
