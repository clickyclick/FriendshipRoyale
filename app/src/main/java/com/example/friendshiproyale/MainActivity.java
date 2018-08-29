package com.example.friendshiproyale;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //image button
    private Button buttonNewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the button
        buttonNewGame = (Button) findViewById(R.id.buttonNewGame);

        //adding a click listener
        buttonNewGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //starting game activity
        startActivity(new Intent(this, NewGameActivity.class));
    }
}