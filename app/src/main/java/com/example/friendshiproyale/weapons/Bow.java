package com.example.friendshiproyale.weapons;

import android.graphics.drawable.Drawable;

public class Bow extends RangedWeapon {
    //ImageView= new

    public Bow(Drawable icon){
        this.icon=icon;
        range=200;
        decibels =20;
        damage=40;
        skillReq=7;
    }
}
