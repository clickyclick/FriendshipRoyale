package com.example.friendshiproyale.weapons;

import android.graphics.drawable.Drawable;

public class Fist extends MeleeWeapon {

    //the default weapon if not armed
    public Fist(Drawable icon){
        super(icon);
        range=5;
        damage=10;
        material="SKIN";
        speed=100;
    }
}
