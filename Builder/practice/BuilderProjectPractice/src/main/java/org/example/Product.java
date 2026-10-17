package org.example;

public class Product {
    private final String name;
    private final double price;
    private final String category;
    private final String description;
    private final int stock;


    private Product (Builder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
        this.description = builder.description;
        this.stock = builder.stock;
    }

    public static class Builder{
        private String name;
        private double price;
        private String category;
        private String description;
        private int stock;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder price(double price){
            this.price = price;
            return this;
        }
        public Builder category(String category){
            this.category = category;
            return this;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder stock(int stock){
            this.stock = stock;
            return this;
        }
        public Product build(){
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Product name is required");
            }

            if (price <= 0) {
                throw new IllegalArgumentException("Price must be greater than zero");
            }
            return new Product(this);
        }

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Stock: " + stock);
    }


}
