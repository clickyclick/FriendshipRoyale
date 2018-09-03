package com.example.friendshiproyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NPCCreationActivity extends AppCompatActivity {
    String npc1;
    String npc2;
    String npc3;
    String npc4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npccreation);
    }

    public void submit(View v) {
        npc1 = ((TextView) findViewById(R.id.NPC1)).getText().toString();
        npc2 = ((TextView) findViewById(R.id.NPC2)).getText().toString();
        npc3 = ((TextView) findViewById(R.id.NPC3)).getText().toString();
        npc4 = ((TextView) findViewById(R.id.NPC4)).getText().toString();

        NPCManager.addNPC(npc1);
        NPCManager.addNPC(npc2);
        NPCManager.addNPC(npc3);
        NPCManager.addNPC(npc4);

        //game loop
        startActivity(new Intent(this, IslandActivity.class));
    }
}
