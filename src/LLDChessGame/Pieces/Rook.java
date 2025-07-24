package LLDChessGame.Pieces;

import LLDChessGame.Board;
import LLDChessGame.Cell;
import LLDChessGame.Enum.PeaceColor;
import LLDChessGame.Piece;

public class Rook extends Piece {
    public Rook(PeaceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        if (start.getRow() != end.getRow() && start.getCol() != end.getCol())
            return false;

        // Optional: Add path check (no blocking pieces)

        Piece dest = end.getPiece();
        return dest == null || dest.getColor() != this.getColor();
    }
}

