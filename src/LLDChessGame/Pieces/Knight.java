package LLDChessGame.Pieces;

import LLDChessGame.Board;
import LLDChessGame.Cell;
import LLDChessGame.Enum.PeaceColor;
import LLDChessGame.Piece;

public class Knight extends Piece {
    public Knight(PeaceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int dx = Math.abs(start.getRow() - end.getRow());
        int dy = Math.abs(start.getCol() - end.getCol());

        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            Piece dest = end.getPiece();
            return dest == null || dest.getColor() != this.getColor();
        }

        return false;
    }
}