package com.colabug.mancala;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MancalaActivity extends Activity
{
    // Logging & helpful
    private final String TAG = MancalaActivity.class.getSimpleName();
    private boolean isInitialized;

    // UI
    EditText player1NameEntryBox;
    EditText player2NameEntryBox;

    // Player data
    private Player player1;
    private Player player2;

    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        // Initialize
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );
        isInitialized = false;

        // Get references to UI components
        player1NameEntryBox = (EditText) findViewById( R.id.player1_name );
        player2NameEntryBox = (EditText) findViewById( R.id.player2_name );

        // Set app initialized
        isInitialized = true;
    }

    // Saves player names when save button is clicked.
    public void savePlayerNames (View view)
    {
        Log.d(TAG, "Saving player names");
        player1 = new Player(player1NameEntryBox.getText().toString());
        player2 = new Player(player2NameEntryBox.getText().toString());
    }
}
