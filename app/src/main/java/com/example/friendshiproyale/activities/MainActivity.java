package com.example.friendshiproyale.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.friendshiproyale.R;

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