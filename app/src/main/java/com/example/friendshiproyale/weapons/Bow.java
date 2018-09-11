package com.example.friendshiproyale.weapons;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Bow extends RangedWeapon {
    //ImageView= new

    public Bow(Drawable icon){
        this.icon=icon;
        range=200;
        decibals=20;
        damage=40;
        skillReq=7;
    }
}
