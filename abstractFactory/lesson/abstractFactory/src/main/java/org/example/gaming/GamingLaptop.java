package org.example.gaming;

import org.example.Laptop;

public class GamingLaptop implements Laptop {

    @Override
    public void build() {
        System.out.println("Building Gaming Laptop");
    }

    @Override
    public void use() {
        System.out.println("Using for Gaming");
    }
}
