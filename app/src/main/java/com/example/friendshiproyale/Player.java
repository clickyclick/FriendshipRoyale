package com.example.friendshiproyale;

import com.example.friendshiproyale.items.Item;
import com.example.friendshiproyale.weapons.MeleeWeapon;
import com.example.friendshiproyale.weapons.RangedWeapon;
import com.example.friendshiproyale.weapons.Weapon;

public class Player extends Human {
    private Inventory inventory;
    private Weapon weapon1;
    private Weapon weapon2;


    public Inventory getInventory() {
        return inventory;
    }

    public Weapon getWeapon1() {
        return weapon1;
    }

    public Weapon getWeapon2() {
        return weapon2;
    }

    Player(String name, boolean gender, int strength, int intellect, int charisma, int skill){
        super(name, gender, strength, intellect, charisma, skill);
    }

    public void createInventory(){
       inventory=new Inventory();
    }

    //true if pickup was successful
    public boolean pickupItem(Item item){
        if(inventory.isFull()){
            return false;
        }

        inventory.addItem(item);
        return true;
    }

    public void dropWeapon1(){
        weapon1=null;
    }

    public void dropWeapon2(){
        weapon2=null;
    }

    public boolean pickupWeapon(Weapon weapon){
        if (weapon1==null){
            weapon1=weapon;
            return true;
        } else if (weapon2 == null){
            weapon2=weapon;
            return true;
        }
        return false;
    }





}
