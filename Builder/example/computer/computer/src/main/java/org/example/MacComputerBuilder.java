package org.example;

import org.example.enums.KeyboardType;
import org.example.enums.MouseType;
import org.example.enums.OperatingSystem;
import org.example.enums.Storage;

public class MacComputerBuilder extends ComputerBuilder {
    @Override
    ComputerBuilder buildComputer() {
        computer.setComputerName("MacBook Pro");
        return this;
    }

    @Override
    ComputerBuilder buildCpu() {
        computer.setCpu("Apple M3 Pro");
        return this;
    }

    @Override
    ComputerBuilder buildMemory() {
        computer.setMemory(18);
        return this;
    }

    @Override
    ComputerBuilder buildOs() {
        computer.setOs(OperatingSystem.MAC_OS);
        return this;
    }

    @Override
    ComputerBuilder buildStorage() {
        computer.setStorage(Storage.SSD_1024);
        return this;
    }

    @Override
    ComputerBuilder buildMouse() {
        computer.setMouseType(MouseType.TOUCHPAD);
        return this;
    }

    @Override
    ComputerBuilder buildKeyboard() {
        computer.setKeyboardType(KeyboardType.MEMBRANE);
        return this;
    }
}
