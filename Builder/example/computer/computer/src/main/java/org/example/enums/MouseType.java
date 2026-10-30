package org.example.enums;

public enum MouseType {
    TOUCHPAD("Touchpad"),
    MOUSE("Mouse");

    private final String title;

    MouseType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
