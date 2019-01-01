package com.example.friendshiproyale.events;

import android.content.Context;

import com.example.friendshiproyale.R;
import com.example.friendshiproyale.Randomize;

public class EngageEnemyEvent extends GameEvent {

    public EngageEnemyEvent(Context context){
        super(context);
    }

    public int randomizeDialogue(){
        int number= Randomize.randomInt(1,3);

        if (number==1){
            return R.string.unarmedCalmEnemy;
        }
        if (number==2){
            return R.string.armedAgitatedEnemy;
        }
        if (number==3){
            return R.string.unknownNoise;
        }

        return R.string.unarmedCalmEnemy;

    }


    public void cont(){

    }
}
