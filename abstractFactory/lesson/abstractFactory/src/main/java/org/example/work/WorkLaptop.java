package org.example.work;

import org.example.Laptop;

public class WorkLaptop implements Laptop {
    @Override
    public void build() {
        System.out.println("Building Work Laptop");
    }

    public void use() {
        System.out.println("Using for Work ");
    }
}
