package com.example.friendshiproyale.items;

public abstract class Item {
    private int uses;

    Item(int uses){
        this.uses= uses;
    }

    public void reduceUses(){
        uses= uses - 1;
    }

    public int getUses(){ return uses;}

}
