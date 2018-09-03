package com.example.friendshiproyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class NewGameActivity extends AppCompatActivity {
    String name;
    boolean gender;
    int str=0;
    int itt=0;
    int chr=0;
    int skl=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
    }

    /**TODO make this work for all 5 stats, not go negative and only can use as many skill points as you own
     *
     * */

    public void increaseStr(View view) {
        str = str + 1;
        updateStat(str,1);
    }

    public void decreaseStr(View view) {
        str = str - 1;
        updateStat(str,1);
    }
    public void increaseInt(View view) {
        itt = itt + 1;
        updateStat(itt,2);
    }

    public void decreaseInt(View view) {
        itt = itt - 1;
        updateStat(itt,2);
    }
    public void increaseChar(View view) {
        chr = chr + 1;
        updateStat(chr,3);
    }

    public void decreaseChar(View view) {
        chr = chr - 1;
        updateStat(chr,3);
    }
    public void increaseSkill(View view) {
        skl = skl + 1;
        updateStat(skl,4);
    }

    public void decreaseSkill(View view) {
        skl = skl - 1;
        updateStat(skl,4);
    }

    private void updateStat(int stat, int id) {
        if (id==1) {
            TextView displayInteger = (TextView) findViewById(R.id.strength);
            displayInteger.setText("Strength: " + stat);
        } else if (id==2){
            TextView displayInteger = (TextView) findViewById(R.id.intellect);
            displayInteger.setText("Intellect: " + stat);
        } else if (id==3){
            TextView displayInteger = (TextView) findViewById(R.id.charisma);
            displayInteger.setText("Charisma: " + stat);
        } else if (id==4){
            TextView displayInteger = (TextView) findViewById(R.id.skill);
            displayInteger.setText("Skill: " + stat);
        }

    }

    public void updateGender(View view){
        boolean isMaleChecked = ((RadioButton) findViewById(R.id.radioMale)).isChecked();
        boolean isFemaleChecked = ((RadioButton) findViewById(R.id.radioFemale)).isChecked();

        if (isMaleChecked){
            gender = true;
        }else if (isFemaleChecked) {
            gender = false;
        }
    }

    public void submit(View v) {
        name = ((TextView) findViewById(R.id.nameText)).getText().toString();
        PlayerManager.createPlayer(name, gender, str, itt, chr, skl);

        //game NPC creation
        startActivity(new Intent(this, NPCCreationActivity.class));
    }
}
