package com.example.friendshiproyale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.friendshiproyale.R;
import com.example.friendshiproyale.events.DiscoverEnemyEvent;

public class DiscoverEnemyActivity extends AppCompatActivity {

    DiscoverEnemyEvent discoverEnemyEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discoverenemy);



        discoverEnemyEvent = new DiscoverEnemyEvent(getApplicationContext());

        //set dialogue
        TextView diag= findViewById(R.id.diag);
        diag.setText(getResources().getString(discoverEnemyEvent.randomizeDiaglogue(), "BOB"));
    }



}
