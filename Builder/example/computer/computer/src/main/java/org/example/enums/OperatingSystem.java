package org.example.enums;

public enum OperatingSystem {
    MAC_OS("macOS"),
    WINDOWS("Windows 11"),
    LINUX("Ubuntu Linux");

    private final String title;

    OperatingSystem(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
