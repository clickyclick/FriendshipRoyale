package com.example.friendshiproyale.activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.friendshiproyale.Inventory;
import com.example.friendshiproyale.PlayerManager;
import com.example.friendshiproyale.R;
import com.example.friendshiproyale.weapons.Bow;
import com.example.friendshiproyale.weapons.Colt;
import com.example.friendshiproyale.weapons.KitchenKnife;
import com.example.friendshiproyale.weapons.MeleeWeapon;
import com.example.friendshiproyale.weapons.RandomStartingWeapon;
import com.example.friendshiproyale.weapons.Weapon;

public class IslandActivity extends AppCompatActivity {
    Weapon weapon1;
    Weapon weapon2;
    Weapon weapon3;
    RadioButton weapon1Button;
    RadioButton weapon2Button;
    RadioButton weapon3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);

        TextView dialogue= findViewById(R.id.diag);

        dialogue.setText(getString(R.string.beach_landing));

        setWeapons();
    }

    private void setWeapons(){
        //TODO randomize weapons that appear in buttons and set the images
        weapon1Button= findViewById(R.id.weapon1);
        weapon2Button= findViewById(R.id.weapon2);
        weapon3Button= findViewById(R.id.weapon3);
        weapon1= RandomStartingWeapon.generateWeapon(getResources());
        weapon2= RandomStartingWeapon.generateWeapon(getResources());
        weapon3= RandomStartingWeapon.generateWeapon(getResources());

        weapon1Button.setForeground(weapon1.getIcon());
        weapon2Button.setForeground(weapon2.getIcon());
        weapon3Button.setForeground(weapon3.getIcon());

        RandomStartingWeapon.clear();
    }

    public void cont(View view){
        if (weapon1Button.isChecked()){
            PlayerManager.pickupWeapon(weapon1);
        }
        else if (weapon2Button.isChecked()){
            PlayerManager.pickupWeapon(weapon2);
        }
        else if (weapon3Button.isChecked()){
            PlayerManager.pickupWeapon(weapon3);
        }
    }
}
