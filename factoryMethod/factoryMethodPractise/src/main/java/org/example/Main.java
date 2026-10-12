package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

    }

    static Drink createDrinkBySpeciality(String speciality) {
        if(speciality.equals("Coffee")) {
            return new Coffee();
        } else if(speciality.equals("Tea")) {
            return new Tea();
        }
        else{
            throw new RuntimeException(speciality + " is not a valid speciality");
        }
    }
}
