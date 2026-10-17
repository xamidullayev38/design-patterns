package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product.Builder()
                .name("Keyboard")
                .price(500_000)
                .build();

        p1.printInfo();
//        Product p2 = new Product.Builder()
//                .name("   ")
//                .price(500_000)
//                .build();
//        p2.printInfo();
//        Product p3 = new Product.Builder()
//                .name("Mouse")
//                .price(-100)
//                .build();
//        p3.printInfo();
    }
}