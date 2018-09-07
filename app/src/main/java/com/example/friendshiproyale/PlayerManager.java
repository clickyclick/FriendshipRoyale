package com.example.friendshiproyale;

public class PlayerManager {
    private static Player player;
    //TODO player locations

    public static void createPlayer(String name, boolean gender, int strength, int intellect, int charisma, int skill){
        player= new Player(name, gender, strength, intellect, charisma, skill);
    }

    public static Player getPlayer(){
        return player;
    }


}
