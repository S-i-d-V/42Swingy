package Swingy.Model;

import Swingy.Model.Artifact;

public class Hero {
    private String name;
    private String heroClass;
    private int level;
    private int experience;
    private int attack;
    private int defense;
    private int hitPoints;

    //Constructor
    public Hero(String name, String heroClass) {
        this.name = name;
        this.heroClass = heroClass;
        this.level = 1;
        this.experience = 0;
        this.attack = 0;
        this.defense = 0;
        this.hitPoints = 0;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}

