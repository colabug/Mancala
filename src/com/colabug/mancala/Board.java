package com.colabug.mancala;

public class Board {
    // Constants
    private static final int NUMBER_BINS = 8;
    private static final int NUMBER_MARBLES = 36;

    // Player bins - one for each side of the board
    private int [] player1Bins;
    private int [] player2Bins;

    Board ()
    {
        player1Bins = new int[NUMBER_BINS];
        player2Bins = new int[NUMBER_BINS];

        // Initialize each bin in board with 3 marbles
        for ( int i = 0; i < NUMBER_BINS; i++ )
        {
            player1Bins[i] = player2Bins[i] = 3;
        }

        // Empty the stores on each side
        player1Bins[0] = player1Bins[NUMBER_BINS - 1] = 0;
        player2Bins[0] = player2Bins[NUMBER_BINS - 1] = 0;
    }

    private void makeMove(PlayerType playerType,
                          int startingBin,
                          int numberMarbles,
                          Direction direction)
    {
        switch (playerType) {
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
