package com.colabug.mancala;

import android.util.Log;

// TODO: Track game history
public class Player
{
    private String TAG = Player.class.getSimpleName();

    String name;

    Player (String name)
    {
        this.name = name;
        Log.d( TAG, "Player created: " + name );
    }
}
