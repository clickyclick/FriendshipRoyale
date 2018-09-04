package com.example.friendshiproyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NPCCreationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npccreation);

        //name validation
        EditText nameText1= findViewById(R.id.NPC1);
        EditText nameText2= findViewById(R.id.NPC2);
        EditText nameText3= findViewById(R.id.NPC3);
        EditText nameText4= findViewById(R.id.NPC4);
        nameText1.addTextChangedListener(new TextValidation(nameText1));
        nameText2.addTextChangedListener(new TextValidation(nameText2));
        nameText3.addTextChangedListener(new TextValidation(nameText3));
        nameText4.addTextChangedListener(new TextValidation(nameText4));
    }

    public void submit(View v) {
        TextView npc1 = ((TextView) findViewById(R.id.NPC1));
        TextView npc2 = ((TextView) findViewById(R.id.NPC2));
        TextView npc3 = ((TextView) findViewById(R.id.NPC3));
        TextView npc4 = ((TextView) findViewById(R.id.NPC4));

        //check names are not null
        if (npc1.length() == 0) {
            npc1.setError("Please enter a name");
        }
        if (npc2.length() == 0) {
            npc2.setError("Please enter a name");
        }
        if (npc3.length() == 0) {
            npc3.setError("Please enter a name");
        }
        if (npc4.length() == 0) {
            npc4.setError("Please enter a name");
        }


        if (!(npc1.getError()==null || npc2.getError()==null || npc3.getError()==null || npc4.getError()==null)) {
            NPCManager.addNPC(npc1.getText().toString());
            NPCManager.addNPC(npc2.getText().toString());
            NPCManager.addNPC(npc3.getText().toString());
            NPCManager.addNPC(npc4.getText().toString());

            //game loop
            startActivity(new Intent(this, IslandActivity.class));
        }
    }
}
