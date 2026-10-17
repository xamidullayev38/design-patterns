package com.wheels.factory;

import com.wheels.factory.electric.ElectricCarFactory;
import com.wheels.factory.sport.SportCarFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sport Car Factory");
        CarFactory sportFactory = new SportCarFactory();
        Engine sportEngine = sportFactory.createEngine();
        Wheel sportWheel = sportFactory.createWheel();

        sportEngine.start();
        sportWheel.rotate();

        System.out.println();

        System.out.println("Electric Car Factory");
        CarFactory electricFactory = new ElectricCarFactory();
        Engine electricEngine = electricFactory.createEngine();
        Wheel electricWheel = electricFactory.createWheel();

        electricEngine.start();
        electricWheel.rotate();
    }
}
