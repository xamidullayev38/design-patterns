package com.wheels.factory.electric;

import com.wheels.factory.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Elektr motor");
    }
}
