package org.example.office;

import org.example.Laptop;

public class OfficeLaptop implements Laptop {
    @Override
    public void build() {
        System.out.println("Building Office Laptop");
    }

    @Override
    public void use() {
        System.out.println("Using for Office");
    }
}
