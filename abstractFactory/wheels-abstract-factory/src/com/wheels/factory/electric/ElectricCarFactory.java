package com.wheels.factory.electric;

import com.wheels.factory.CarFactory;
import com.wheels.factory.Engine;
import com.wheels.factory.Wheel;

public class ElectricCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Wheel createWheel() {
        return new ElectricWheel();
    }
}
