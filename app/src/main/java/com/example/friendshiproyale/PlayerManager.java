package com.example.friendshiproyale;

import com.example.friendshiproyale.weapons.Weapon;

public class PlayerManager {
    private static Player player;
    //TODO player locations

    public static void createPlayer(String name, boolean gender, int strength, int intellect, int charisma, int skill){
        player= new Player(name, gender, strength, intellect, charisma, skill);
        player.createInventory();
    }

    public static Player getPlayer(){
        return player;
    }

    public static void dropWeapon1(){
        player.dropWeapon1();
    }

    public static void dropWeapon2(){
        player.dropWeapon2();
    }

    public static boolean pickupWeapon(Weapon weapon){
        return player.pickupWeapon(weapon);
    }

    public static Weapon getWeapon1(){
        return player.getWeapon1();
    }

    public static Weapon getWeapon2(){
        return player.getWeapon2();
    }


}
