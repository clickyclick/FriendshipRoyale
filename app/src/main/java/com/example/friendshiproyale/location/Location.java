package com.example.friendshiproyale.location;

import java.util.ArrayList;
import java.util.List;

public abstract class Location {
    protected List<Location> connections;
    String name;
    int trees;
    boolean waterBody;
    boolean hasSand;
    boolean mosquito;

    Location(){
        connections = new ArrayList<>();
    }


    public void attach(Location location){
        connections.add(location);
    }


}
