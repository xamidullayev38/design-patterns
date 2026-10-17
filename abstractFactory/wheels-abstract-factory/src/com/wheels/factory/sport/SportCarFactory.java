package com.wheels.factory.sport;

import com.wheels.factory.CarFactory;
import com.wheels.factory.Engine;
import com.wheels.factory.Wheel;

public class SportCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new SportEngine();
    }

    @Override
    public Wheel createWheel() {
        return new SportWheel();
    }
}
