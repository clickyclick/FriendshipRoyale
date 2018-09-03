package com.example.friendshiproyale;

import java.util.Vector;

public class NPCManager {
    private static Vector<NPC> npcs;


    private static void createNPC(){
        //useless
    }

    public static void addNPC(String name){
        npcs.add(createNPC(name));
    }

    public static Vector<NPC> getNPCs(){
        return npcs;
    }

    public static void cleanUp(){
        //clean up anything related to NPCs
    }

    private static NPC createNPC(String name){
        //TODO rng the stats
        NPC npc= new NPC (name, true, 5,5,5,5);
        return npc;
    }

}
