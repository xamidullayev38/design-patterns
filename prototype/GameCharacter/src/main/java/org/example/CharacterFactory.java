package org.example;

public class CharacterFactory {
    private GameCharacter character;
    public CharacterFactory (GameCharacter character){};

    public GameCharacter setCharacter(GameCharacter character){
        this.character = character;
        return character;
    }
    public GameCharacter cloneCharacter(GameCharacter character){
        return (GameCharacter) character.cloner();
    }

}
