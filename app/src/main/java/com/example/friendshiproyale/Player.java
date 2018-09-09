package com.example.friendshiproyale;

public class Player extends Human {
    private Inventory inventory;

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



}
