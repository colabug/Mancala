package com.colabug.mancala;

import android.util.Log;

// TODO: Track game history
public class Player
{
    // Logging
    private String TAG = Player.class.getSimpleName();

    // Player data
    private String name;
    private PlayerType playerType;

    Player (String name, PlayerType type)
    {
        this.name = name;
        this.playerType = type;
        Log.d( TAG, "Player created with name: " + name );
        Log.d( TAG, "Player type: " + type.name() );
    }

    public String getName()
    {
        return name;
    }
}
