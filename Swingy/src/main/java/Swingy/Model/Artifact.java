package Swingy.Model;

public abstract class Artifact {
    private String name;
    private String type;
    private int attack;
    private int defense;
    private int hitPoints;

    //Constructor
    public Artifact(String name, String type, int attack, int defense, int hitPoints) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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