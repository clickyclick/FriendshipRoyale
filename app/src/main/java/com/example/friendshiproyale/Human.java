package com.example.friendshiproyale;

public abstract class Human {
    private String name;
    private boolean gender;
    private int strength;
    private int intellect;
    private int charisma;
    private int skill;

    public boolean isGender() {
        return gender;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getSkill() {
        return skill;
    }

    Human(String name, boolean gender, int strength, int intellect, int charisma, int skill){
        this.name=name;
        this.gender=gender;
        this.strength=strength;
        this.intellect=intellect;
        this.charisma=charisma;
        this.skill=skill;
    }

    public String getName(){
        return name;
    }



}
