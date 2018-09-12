package com.example.friendshiproyale;

import com.example.friendshiproyale.location.Location;

public class GameManager {

    private Location currentLocation;


    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }


}
