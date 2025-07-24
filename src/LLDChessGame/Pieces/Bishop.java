package LLDChessGame.Pieces;

import LLDChessGame.Board;
import LLDChessGame.Cell;
import LLDChessGame.Enum.PeaceColor;
import LLDChessGame.Piece;

public class Bishop extends Piece {
    public Bishop(PeaceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int dx = Math.abs(start.getRow() - end.getRow());
        int dy = Math.abs(start.getCol() - end.getCol());

        if (dx == dy) {
            Piece dest = end.getPiece();
            return dest == null || dest.getColor() != this.getColor();
        }

        return false;
    }
}