package com.example.friendshiproyale;

import java.util.Vector;

public class NPCManager {
    private static Vector<NPC> npcs;


    public static void init(){
        npcs =new Vector<>();
    }

    public static void addNPC(String name){
        NPC npc= createNPC(name);
        npcs.add(npc);
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
