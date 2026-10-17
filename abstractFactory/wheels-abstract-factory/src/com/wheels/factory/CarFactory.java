package com.wheels.factory;

public interface CarFactory {
    Engine createEngine();
    Wheel createWheel();
}
