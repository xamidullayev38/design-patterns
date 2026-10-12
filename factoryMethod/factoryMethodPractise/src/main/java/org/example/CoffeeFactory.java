package org.example;

public class CoffeeFactory implements DrinkFactroy {
    @Override
    public Coffee createDrink() {
        return new Coffee();
    }
}
