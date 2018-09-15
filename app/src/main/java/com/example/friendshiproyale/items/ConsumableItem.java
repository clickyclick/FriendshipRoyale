package com.example.friendshiproyale.items;

import android.graphics.drawable.Drawable;

public abstract class ConsumableItem extends Item{
    private int uses;

    public ConsumableItem(int uses, Drawable icon){
        super(icon);
        this.uses= uses;
    }

    public void reduceUses(){
        uses= uses - 1;
    }

    public int getUses(){ return uses;}
}
