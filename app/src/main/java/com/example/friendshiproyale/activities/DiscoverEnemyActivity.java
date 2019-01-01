package com.example.friendshiproyale.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.friendshiproyale.GameManager;
import com.example.friendshiproyale.NPC;
import com.example.friendshiproyale.R;
import com.example.friendshiproyale.Randomize;
import com.example.friendshiproyale.events.DiscoverEnemyEvent;

public class DiscoverEnemyActivity extends AppCompatActivity {

    DiscoverEnemyEvent discoverEnemyEvent;
    NPC relatedNPC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discoverenemy);



        discoverEnemyEvent = new DiscoverEnemyEvent(getApplicationContext());
        relatedNPC= Randomize.randomLiveNPC();
        GameManager.setActiveNPC(relatedNPC);

        //set dialogue
        TextView diag= findViewById(R.id.diag);
        diag.setText(getResources().getString(discoverEnemyEvent.randomizeDialogue(), relatedNPC.getName()));
    }

    public void attack (View view){
        Intent i= new Intent(this, EngageEnemyActivity.class);

        startActivity(i);
    }







}
