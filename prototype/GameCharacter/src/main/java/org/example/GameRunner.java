package org.example;

public class GameRunner {
    public static void main(String[] args) {
        GameCharacter p1 = new GameCharacter(1,"T",2,"M416");
        GameCharacter p2 = new GameCharacter(1,"CT",5,"M416");
        CharacterFactory factory = new CharacterFactory(p1);
        factory.cloneCharacter(p1);
        factory.cloneCharacter(p2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
