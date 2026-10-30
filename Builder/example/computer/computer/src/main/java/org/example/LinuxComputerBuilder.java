package org.example;

import org.example.enums.KeyboardType;
import org.example.enums.MouseType;
import org.example.enums.OperatingSystem;
import org.example.enums.Storage;

public class LinuxComputerBuilder extends ComputerBuilder {
    @Override
    ComputerBuilder buildComputer() {
        computer.setComputerName("Linux Workstation");
        return this;
    }

    @Override
    ComputerBuilder buildCpu() {
        computer.setCpu("AMD Ryzen 7");
        return this;
    }

    @Override
    ComputerBuilder buildMemory() {
        computer.setMemory(32);
        return this;
    }

    @Override
    ComputerBuilder buildOs() {
        computer.setOs(OperatingSystem.LINUX);
        return this;
    }

    @Override
    ComputerBuilder buildStorage() {
        computer.setStorage(Storage.SSD_512);
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
