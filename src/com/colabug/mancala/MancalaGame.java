package com.colabug.mancala;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MancalaGame extends Activity
{
    // Logging & helpful
    private final String TAG = MancalaGame.class.getSimpleName();

    // Player data
    private Player player1;
    private Player player2;

    // Game data
    private Board board;

    // UI
    private GridView gridview;
    private MancalaGameAdapter gridAdapter;

    @Override
    public void onCreate (Bundle savedInstanceState)
    {
        // Initialize
        super.onCreate( savedInstanceState  );
        setContentView( R.layout.game_board );

        // Create players
        Log.d( TAG, "Creating players." );
        player1 = new Player( getIntent().getStringExtra( "player1" ),
                              PlayerType.PLAYER1 );
        player2 = new Player( getIntent().getStringExtra( "player2" ),
                              PlayerType.PLAYER2 );

        // Greet players
        TextView welcomeMessage = (TextView) findViewById( R.id.welcome_message );
        String message = getResources().getString( R.string.GAME_WELCOME_TEXT );
        message += " " + player1.getName() + " & " + player2.getName() + "!";
        welcomeMessage.setText( message );

        // Create game board
        Log.d( TAG, "Creating game board" );
        board = new Board();

        // Set up bin view & adapter
        gridview = (GridView) findViewById( R.id.gridview );
        gridAdapter = new MancalaGameAdapter( this );
        gridview.setAdapter( gridAdapter );

        // TODO: Clicky doesn't work
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                Log.d( TAG, "Item clicked at position " + position );
                v.setBackgroundDrawable( v.getResources().getDrawable( R.drawable.green_marble ) );
            }
        });

        // Rudimentary display
        TextView player1view = (TextView) findViewById( R.id.player1_bins );
        player1view.setText( board.getPlayer1BinString() );
        TextView player2view = (TextView) findViewById( R.id.player2_bins );
        player2view.setText( board.getPlayer2BinString() );
    }

    public static Intent createIntent (Context context)
    {
        return new Intent( context, MancalaGame.class );
    }

    public class MancalaGameAdapter extends BaseAdapter
    {
        private Context context;

        public MancalaGameAdapter (Context c)
        {
            context = c;
        }

        public int getCount()
        {
            return 0;
        }

        public Object getItem (int position)
        {
            return null;
        }

        public long getItemId (int position)
        {
            return 0;
        }

        public View getView (int position, View convertView, ViewGroup parent)
        {
            LinearLayout row;
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // If it's not recycled, initialize attributes
            if ( convertView == null )
            {
                row = new LinearLayout( context );
            }
            else
            {
                row = (LinearLayout) inflater.inflate( R.layout.mancala_grid_cell, parent, false );
            }

            return convertView;
        }
    }
}
