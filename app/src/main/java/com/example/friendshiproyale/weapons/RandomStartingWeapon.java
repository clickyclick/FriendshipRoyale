package com.example.friendshiproyale.weapons;

import android.content.res.Resources;

import com.example.friendshiproyale.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStartingWeapon {
    private static List<Integer> list = new ArrayList<>();

    public static Weapon generateWeapon(Resources res){
        Random rand = new Random();
        while(true) {
            int n = rand.nextInt(3) + 1;

            if (n==1 && !list.contains(1)){
                list.add(1);
                return new KitchenKnife(res.getDrawable(R.drawable.kitchenknife,null));
            }
            else if (n==2 && !list.contains(2)){
                list.add(2);
                return new Colt(res.getDrawable(R.drawable.colt,null));
            }
            else if (n==3 && !list.contains(3)){
                list.add(3);
                return new Bow(res.getDrawable(R.drawable.bow,null));
            }
        }

    }

    public static void clear() {
        list.clear();
    }

}
