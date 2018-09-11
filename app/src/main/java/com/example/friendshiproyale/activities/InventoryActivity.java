package com.example.friendshiproyale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.friendshiproyale.PlayerManager;
import com.example.friendshiproyale.R;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        fillInfo();
    }

    //fills the info on the inventory page
    private void fillInfo(){
        //sets player name at the top
        TextView nameText= findViewById(R.id.nameText);
        String inventoryName=getResources().getString(R.string.inventoryName, PlayerManager.getPlayer().getName());
        nameText.setText(inventoryName);

        //sets the stats


        //sets the weapons
        ImageButton weapon1Button= findViewById(R.id.weaponbutton1);
        ImageButton weapon2Button= findViewById(R.id.weaponbutton2);
        if (PlayerManager.getWeapon1()!=null){
           weapon1Button.setImageDrawable(PlayerManager.getWeapon1().getIcon());
        }
        if (PlayerManager.getWeapon2()!=null){
            weapon2Button.setImageDrawable(PlayerManager.getWeapon2().getIcon());
        }

        //sets the items
    }


}
