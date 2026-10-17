package com.wheels.factory.sport;

import com.wheels.factory.Engine;

public class SportEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Sport dvigatel. ");
    }
}
