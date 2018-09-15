package com.example.friendshiproyale.items;

import android.graphics.drawable.Drawable;

public abstract class Item{

    private Drawable icon;

    public Item(Drawable icon){
        this.icon=icon;
    }

    public Drawable getIcon() {
        return icon;
    }
}
