package com.example.friendshiproyale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.friendshiproyale.GameManager;
import com.example.friendshiproyale.NPC;
import com.example.friendshiproyale.R;
import com.example.friendshiproyale.events.DiscoverEnemyEvent;
import com.example.friendshiproyale.events.EngageEnemyEvent;

public class EngageEnemyActivity extends AppCompatActivity {

    EngageEnemyEvent engageEnemyEvent;
    NPC relatedNPC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engage_enemy);

        engageEnemyEvent = new EngageEnemyEvent(getApplicationContext());
        relatedNPC= GameManager.getActiveNPC();

        //set dialogue
        TextView diag= findViewById(R.id.diag);
        diag.setText(getResources().getString(engageEnemyEvent.randomizeDialogue(), relatedNPC.getName()));
    }
}
