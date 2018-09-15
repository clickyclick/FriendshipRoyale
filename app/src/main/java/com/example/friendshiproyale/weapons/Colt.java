package com.example.friendshiproyale.weapons;

import android.graphics.drawable.Drawable;

public class Colt extends RangedWeapon {

    public Colt(Drawable icon) {
        super(icon);
        range = 200;
        decibels = 200;
        damage = 50;
        skillReq = 4;
    }
}
