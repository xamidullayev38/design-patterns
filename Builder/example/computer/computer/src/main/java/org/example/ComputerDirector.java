package org.example;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        builder.createComputer();
        builder.buildComputer()
                .buildCpu()
                .buildMemory()
                .buildOs()
                .buildStorage()
                .buildMouse()
                .buildKeyboard();
        return builder.getComputer();
    }
}
