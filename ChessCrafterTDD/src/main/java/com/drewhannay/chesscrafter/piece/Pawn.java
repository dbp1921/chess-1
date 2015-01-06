package com.drewhannay.chesscrafter.piece;

import com.drewhannay.chesscrafter.board.BoardCoordinate;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    private boolean mHasMoved;

    public Pawn() {
        this(true);
    }

    public Pawn(boolean isFirstPlayerPiece) {
        super(isFirstPlayerPiece);
    }

    public void setHasMoved(boolean hasMoved) {
        mHasMoved = hasMoved;
    }

    @Override
    public List<BoardCoordinate> getMovesFrom(BoardCoordinate startingLocation, int boardSize) {
        List<BoardCoordinate> possibleMoves = new ArrayList<>();
        possibleMoves.add(BoardCoordinate.at(startingLocation.x, startingLocation.y + 1));
        if (!mHasMoved) {
            possibleMoves.add(BoardCoordinate.at(startingLocation.x, startingLocation.y + 2));
        }
        return possibleMoves;
    }
}
