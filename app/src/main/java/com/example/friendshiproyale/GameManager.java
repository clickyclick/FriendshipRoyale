package com.example.friendshiproyale;

import com.example.friendshiproyale.location.Beach;
import com.example.friendshiproyale.location.Cavemouth;
import com.example.friendshiproyale.location.Cliff;
import com.example.friendshiproyale.location.LightForest;
import com.example.friendshiproyale.location.Location;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private static Location currentLocation;
    private static List<Location> locations;
    private int time = 0;

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

    public static void setCurrentLocation(Location loc) {
       currentLocation = loc;
    }


}
