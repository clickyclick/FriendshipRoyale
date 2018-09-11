package com.example.friendshiproyale.weapons;

import android.graphics.drawable.Drawable;


public class KitchenKnife extends MeleeWeapon {


    public KitchenKnife(Drawable icon){
        this.icon=icon;
        range=10;
        damage=30;
        material="METAL";
        speed=100;
    }


}
