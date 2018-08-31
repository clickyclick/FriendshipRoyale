package com.example.friendshiproyale;

public class PlayerManager {
    public static Player player;

    public static void createPlayer(String name, boolean gender, int strength, int intellect, int charisma, int skill){
        player= new Player(name, gender, strength, intellect, charisma, skill);
    }



}
