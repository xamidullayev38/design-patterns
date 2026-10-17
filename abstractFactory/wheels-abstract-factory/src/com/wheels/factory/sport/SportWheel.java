package com.wheels.factory.sport;

import com.wheels.factory.Wheel;

public class SportWheel implements Wheel {
    @Override
    public void rotate() {
        System.out.println("Sport balon");
    }
}
