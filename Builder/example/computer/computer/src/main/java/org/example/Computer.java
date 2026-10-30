package org.example;

import org.example.enums.KeyboardType;
import org.example.enums.MouseType;
import org.example.enums.OperatingSystem;
import org.example.enums.Storage;

public class Computer {
    private String computerName;
    private String cpu;
    private Integer memory;
    private OperatingSystem os;
    private Storage storage;
    private MouseType mouseType;
    private KeyboardType keyboardType;

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setMouseType(MouseType mouseType) {
        this.mouseType = mouseType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Computername='" + computerName + '\'' +
                ", Cpu=" + cpu +
                ", memory=" + memory + " GB" +
                ", os=" + os +
                ", storage=" + storage +
                ", mouse=" + mouseType +
                ", keyboard=" + keyboardType +
                '}';
    }
}
