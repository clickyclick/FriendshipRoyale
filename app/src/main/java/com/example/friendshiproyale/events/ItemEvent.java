package com.example.friendshiproyale.events;

import android.content.Context;
import android.view.View;
import com.example.friendshiproyale.PlayerManager;
import com.example.friendshiproyale.weapons.RandomStartingWeapon;
import com.example.friendshiproyale.weapons.Weapon;

import java.util.Collections;
import java.util.ArrayList;

public class ItemEvent extends GameEvent {

    public int weapon_count = 3;

    public ArrayList<Weapon> weapons = new ArrayList<>();
    public ArrayList<Boolean> desired_weapons = new ArrayList<>();

    public ItemEvent(Context context){
        super(context);
    }

    public void setWeapons()
    {
        for(int i = 0; i < weapon_count; i++)
        {
            Weapon weapon = RandomStartingWeapon.generateWeapon(context.getResources());
            if(weapon != null) {
                weapons.add(weapon);
                desired_weapons.add(false);
            }
        }
    }

    //@SCURTU IS THIS EVEN CALLED?
    public void cont(){
        for(int i = 0; i < weapons.size(); i++)
        {
            if(desired_weapons.get(i))
            {
                PlayerManager.pickupWeapon(weapons.get(i));
            }
        }

        Collections.fill(desired_weapons, Boolean.FALSE);
    }
}
