package org.example.enums;

public enum Storage {
    SSD_512("SSD 512 GB"),
    SSD_1024("SSD 1024 GB");

    private final String title;

    Storage(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
