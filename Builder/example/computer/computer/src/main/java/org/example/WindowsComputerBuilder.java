package org.example;

import org.example.enums.KeyboardType;
import org.example.enums.MouseType;
import org.example.enums.OperatingSystem;
import org.example.enums.Storage;

public class WindowsComputerBuilder extends ComputerBuilder {
    @Override
    ComputerBuilder buildComputer() {
        computer.setComputerName("Windows PC");
        return this;
    }

    @Override
    ComputerBuilder buildCpu() {
        computer.setCpu("Intel Core i7");
        return this;
    }

    @Override
    ComputerBuilder buildMemory() {
        computer.setMemory(16);
        return this;
    }

    @Override
    ComputerBuilder buildOs() {
        computer.setOs(OperatingSystem.WINDOWS);
        return this;
    }

    @Override
    ComputerBuilder buildStorage() {
        computer.setStorage(Storage.SSD_1024);
        return this;
    }

    @Override
    ComputerBuilder buildMouse() {
        computer.setMouseType(MouseType.MOUSE);
        return this;
    }

    @Override
    ComputerBuilder buildKeyboard() {
        computer.setKeyboardType(KeyboardType.MECHANICAL);
        return this;
    }
}
