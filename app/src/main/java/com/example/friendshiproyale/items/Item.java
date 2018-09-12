package com.example.friendshiproyale.items;

import android.graphics.drawable.Drawable;

public abstract class Item {
    private int uses;
    private Drawable icon;

    Item(int uses, Drawable icon){
        this.uses= uses;
        this.icon=icon;
    }

    public void reduceUses(){
        uses= uses - 1;
    }

    public int getUses(){ return uses;}

}
