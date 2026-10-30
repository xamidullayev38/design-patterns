package org.example;

public class GameCharacter implements Copyable {
    private Integer id;
    private String name;
    private Integer level;
    private String weapon;


    public GameCharacter(Integer id, String name, Integer level, String weapon) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.weapon = weapon;
    }



    @Override
    public String toString() {
        return String.format(
                "GameCharacter [ id=%-4d | name=%-10s | level=%-3d | weapon=%-10s ]",
                id, name, level, weapon
        );
    }



    @Override
    public Object cloner(){
        return new GameCharacter(this.id,this.name,this.level,this.weapon);
    }



    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
