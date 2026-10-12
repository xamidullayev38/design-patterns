package org.example;

public class TeaFactory  implements DrinkFactroy {
    @Override
    public Coffee createDrink(){
        return new Coffee();
    }
}