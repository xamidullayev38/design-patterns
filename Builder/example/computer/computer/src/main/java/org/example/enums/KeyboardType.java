package org.example.enums;

public enum KeyboardType {
    MECHANICAL("Mechanical"),
    MEMBRANE("Membrane");

    private final String title;

    KeyboardType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
