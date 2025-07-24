package LLDChessGame.Pieces;

import LLDChessGame.Board;
import LLDChessGame.Cell;
import LLDChessGame.Enum.PeaceColor;
import LLDChessGame.Piece;

public class Pawn extends Piece {
    public Pawn(PeaceColor color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int direction = (this.getColor() == PeaceColor.WHITE) ? -1 : 1;
        int dx = end.getRow() - start.getRow();
        int dy = Math.abs(end.getCol() - start.getCol());

        Piece dest = end.getPiece();

        // 1 step forward
        if (dy == 0 && dx == direction && dest == null) {
            return true;
        }

        // 2 step forward from initial position
        if (dy == 0 && dx == 2 * direction && dest == null &&
                ((this.getColor() == PeaceColor.WHITE && start.getRow() == 6) || (this.getColor() == PeaceColor.BLACK && start.getRow() == 1))) {
            return true;
        }

        // Capture diagonally
        if (dy == 1 && dx == direction && dest != null && dest.getColor() != this.getColor()) {
            return true;
        }

        return false;
    }
}