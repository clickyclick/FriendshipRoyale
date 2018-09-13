package com.example.friendshiproyale.events;

import android.content.Context;


public abstract class GameEvent{
   Context context;

   public GameEvent(Context context){
      this.context = context;
   }
   abstract void cont();
}
