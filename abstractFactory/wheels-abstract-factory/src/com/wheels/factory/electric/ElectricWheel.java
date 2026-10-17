package com.wheels.factory.electric;

import com.wheels.factory.Wheel;

public class ElectricWheel implements Wheel {
    @Override
    public void rotate() {
        System.out.println("Ekologik toza balon .");
    }
}
