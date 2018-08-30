package com.example.friendshiproyale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewGameActivity extends AppCompatActivity {
    int min=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
    }

    /**TODO make this work for all 5 stats, not go negative and only can use as many skill points as you own
     *
     * */

    public void increaseInteger(View view) {
        min = min + 1;
        display(min);
    }

    public void decreaseInteger(View view) {
        min = min - 1;
        display(min);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.strength);
        displayInteger.setText("Strength: " + number);
    }
}
