package com.colabug.mancala;

public class Board {
    // Constants
    private static final int NUMBER_COLUMNS = 8;
    private static final int NUMBER_ROWS = 2;
    private static final int NUMBER_MARBLES = 36;

    // Player bins - one for each side of the board
    private int [] player1Bins;
    private int [] player2Bins;

    Board ()
    {
        player1Bins = new int[NUMBER_COLUMNS];
        player2Bins = new int[NUMBER_COLUMNS];

        // Initialize each bin in board with 3 marbles
        for ( int i = 1; i < NUMBER_COLUMNS - 1; i++ )
        {
            player1Bins[i] = player2Bins[i] = 3;
        }

        // Empty the stores on each side
        player1Bins[0] = player1Bins[NUMBER_COLUMNS - 1] = 0;
        player2Bins[0] = player2Bins[NUMBER_COLUMNS - 1] = 0;
    }

    public String getPlayer1BinString ()
    {
        String temp = "";
        for ( int bin : player1Bins )
        {
            temp += bin + " ";
        }

        return temp;
    }

    public String getPlayer2BinString ()
    {
        String temp = "";
        for ( int bin : player2Bins )
        {
            temp += bin + " ";
        }

        return temp;
    }

    private void makeMove (PlayerType playerType,
                           int startingBin,
                           int numberMarbles,
                           Direction direction)
    {
        switch ( playerType )
        {
            case PLAYER1:
                // TODO: Process a move
                // Account for wrap around moves

            case PLAYER2:
                // TODO: Process a move
                // Account for wrap around moves

            // Shouldn't be here
            default:
        }
    }
}
