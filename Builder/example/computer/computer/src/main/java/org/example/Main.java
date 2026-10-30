package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new MacComputerBuilder());
        System.out.println(director.constructComputer());

        director.setBuilder(new WindowsComputerBuilder());
        System.out.println(director.constructComputer());

        director.setBuilder(new LinuxComputerBuilder());
        System.out.println(director.constructComputer());
    }
}
