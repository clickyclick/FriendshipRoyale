package com.example.friendshiproyale;

import java.util.Random;

public class Randomize {

   private static Random  rand = new Random();

    public static int randomInt(int lower, int upper){
        int  n = rand.nextInt(upper+1 -lower) + lower;
        return n;
    }
}
