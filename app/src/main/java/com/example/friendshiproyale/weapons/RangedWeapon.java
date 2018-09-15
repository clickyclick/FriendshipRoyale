package com.example.friendshiproyale.weapons;
        import android.graphics.drawable.Drawable;

public abstract class RangedWeapon extends Weapon {
    protected int range;
    protected int decibels;
    protected int damage;
    protected int skillReq;

    RangedWeapon(Drawable icon){
        super(icon);
    }

    public int shoot(){
        //filler
        return 0;
    }

}
