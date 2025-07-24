package LLDChessGame.Pieces;

import LLDChessGame.Board;
import LLDChessGame.Cell;
import LLDChessGame.Enum.PeaceColor;
import LLDChessGame.Piece;

public class King extends Piece {
    public King(PeaceColor peaceColor) {
        super(peaceColor);
    }

    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        int dx = Math.abs(start.getRow() - end.getRow());
        int dy = Math.abs(start.getCol() - end.getCol());
        return dx <= 1 && dy <= 1 && board.getCell(end.getRow(), end.getCol()).isEmpty();
    }
}
