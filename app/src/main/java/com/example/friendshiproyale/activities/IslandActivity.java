package com.example.friendshiproyale.activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.friendshiproyale.Inventory;
import com.example.friendshiproyale.R;

public class IslandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);

        TextView dialogue= findViewById(R.id.diag);

        dialogue.setText(getString(R.string.beach_landing));


    }




    public void inventoryScreen(View view){
        startActivity(new Intent(this, InventoryActivity.class));
    }
}
