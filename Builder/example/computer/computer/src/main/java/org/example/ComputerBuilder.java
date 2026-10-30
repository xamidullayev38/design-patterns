package org.example;

public abstract class ComputerBuilder {
    Computer computer;

    void createComputer() {
        computer = new Computer();
    }

    abstract ComputerBuilder buildComputer();

    abstract ComputerBuilder buildCpu();

    abstract ComputerBuilder buildMemory();

    abstract ComputerBuilder buildOs();

    abstract ComputerBuilder buildStorage();

    abstract ComputerBuilder buildMouse();

    abstract ComputerBuilder buildKeyboard();

    Computer getComputer() {
        return computer;
    }
}
