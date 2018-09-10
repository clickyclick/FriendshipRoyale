package com.example.friendshiproyale;

import com.example.friendshiproyale.items.Item;

import java.util.Vector;

public class Inventory {
    private Vector<Item> items;
    private int capacity=6;

    Inventory(){
        items=new Vector<>();
    }

    public boolean isFull(){
        return items.size() >= 6;
    }

    public Vector<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

}
