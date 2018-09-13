package com.example.friendshiproyale.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.util.DisplayMetrics;


import com.example.friendshiproyale.R;
import com.example.friendshiproyale.events.ItemEvent;
import com.example.friendshiproyale.weapons.RandomStartingWeapon;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {

    ArrayList<RadioButton> radio_buttons = new ArrayList<RadioButton>();
    ItemEvent item_event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        item_event = new ItemEvent(getApplicationContext());

        TextView dialogue= findViewById(R.id.diag);

        dialogue.setText(getString(R.string.beach_landing));

        setWeapons();
    }

    private int pxToDp(int px) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int dp = Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return dp;
    }

    private void setWeapons(){
        //TODO randomize weapons that appear in buttons and set the images

        item_event.setWeapons();
        int number = item_event.weapons.size();

        RadioGroup ll = findViewById(R.id.selection);
        for (int i = 1; i <= number; i++) {
            RadioButton rdbtn = new RadioButton(this);
            rdbtn.setId(i);

            int dp_size = 80;
            int pixel_size = (int)TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    dp_size,
                    getResources().getDisplayMetrics()
            );
            int margin_size = 10;

            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int width = displayMetrics.widthPixels;


            //Calculate appropriate size for buttons
            if((2*margin_size + pixel_size)*item_event.weapons.size() >= width )
            {
                // TODO: Resize item boxes when there are too many to fit on screen to prevent crashing
                // Currently happens when there are 4 or more item boxes
//                pixel_size = (width-20) / (2*margin_size + pixel_size) - 100;
//                System.out.println(pixel_size + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            }


            RadioGroup.LayoutParams params = new RadioGroup.LayoutParams(pixel_size,pixel_size);
            params.setMargins(margin_size,margin_size,margin_size,margin_size);
            rdbtn.setLayoutParams(params);
            rdbtn.setBackground(getResources().getDrawable(R.drawable.choicebackground, null));
            rdbtn.setButtonDrawable(android.R.color.transparent);

            rdbtn.setForeground(item_event.weapons.get(i - 1).getIcon());

            ll.addView(rdbtn);
            radio_buttons.add(rdbtn);
        }

        RandomStartingWeapon.clear();
    }

    public void cont(View view){
        for(int i = 0; i < radio_buttons.size(); i++)
        {
            if(radio_buttons.get(i).isChecked())
            {
                item_event.desired_weapons.set(i,true);
            }
        }

        item_event.cont();
    }
}
