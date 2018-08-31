package com.example.friendshiproyale;

public abstract class Human {
    private String name;
    private boolean gender;
    private int strength;
    private int intellect;
    private int charisma;
    private int skill;

    Human(String name, boolean gender, int strength, int intellect, int charisma, int skill){
        this.name=name;
        this.gender=gender;
        this.strength=strength;
        this.intellect=intellect;
        this.charisma=charisma;
        this.skill=skill;
    }



}
