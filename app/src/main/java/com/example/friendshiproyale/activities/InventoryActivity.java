package com.example.friendshiproyale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.friendshiproyale.PlayerManager;
import com.example.friendshiproyale.R;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        TextView nameText= findViewById(R.id.nameText);
        String inventoryName=getResources().getString(R.string.inventoryName, PlayerManager.getPlayer().getName());
        nameText.setText(inventoryName);
    }


}
