package com.colabug.mancala;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MancalaBoard extends Activity {
    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        // Initialize
        super.onCreate(savedInstanceState);
        setContentView( R.layout.game_board );
    }

    public static Intent createIntent (Context context)
    {
        return new Intent( context, MancalaBoard.class );
    }
}
