package com.example.friendshiproyale;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.friendshiproyale.activities.DiscoverEnemyActivity;
import com.example.friendshiproyale.activities.NewGameActivity;
import com.example.friendshiproyale.location.Beach;
import com.example.friendshiproyale.location.Cavemouth;
import com.example.friendshiproyale.location.Cliff;
import com.example.friendshiproyale.location.LightForest;
import com.example.friendshiproyale.location.Location;

import java.util.ArrayList;
import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

public class GameManager {

    private static Location currentLocation;
    private static NPC activeNPC;
    private static List<Location> locations;
    private static int time = 0;

    public static void init(){
        initLocations();
    }

    private static void initLocations(){
        locations = new ArrayList<>();

        //create all locations
        Beach beach=new Beach();
        Cavemouth cavemouth=new Cavemouth();
        LightForest lightforest=new LightForest();
        Cliff cliff= new Cliff();

        //add all locations to list
        locations.add(beach);
        locations.add(cavemouth);
        locations.add(lightforest);
        locations.add(cliff);

        //attach adjacent locations
        //beach connections
        beach.attach(lightforest);

        //lightforest connections
        lightforest.attach(beach);
        lightforest.attach(cavemouth);

        //cavemouth connections
        cavemouth.attach(lightforest);


    }

    public static void incrementTime() { time++; }

    public static int getTime() { return time; }

    public static Location getCurrentLocation() {
        return currentLocation;
    }

    public static NPC getActiveNPC(){
        return activeNPC;
    }

    public static void setActiveNPC(NPC npc){
        activeNPC=npc;
    }

    public static void setCurrentLocation(Location loc) {
       currentLocation = loc;
    }

    public static void gameLoop(Activity context){

        while(PlayerManager.isAlive() && NPCManager.areAlive()){


            //start random activity

            randomActivity();
            context.startActivity(new Intent(context, DiscoverEnemyActivity.class));
            //increment time after each event
            incrementTime();
            break;
        }


    }

    private static void randomActivity(){

    }


}
