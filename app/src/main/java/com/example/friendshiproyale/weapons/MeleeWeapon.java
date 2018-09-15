package com.example.friendshiproyale.weapons;
import android.graphics.drawable.Drawable;



public abstract class MeleeWeapon extends Weapon {
    protected int range;
    protected int speed;
    protected int damage;
    protected String material;
    protected int skillReq;
    protected int strengthReq;

    MeleeWeapon(Drawable icon){
        super(icon);
    }

    public int attack(){
        //filler
        return 0;
    }

}
