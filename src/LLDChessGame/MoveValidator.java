package LLDChessGame;

public class MoveValidator {
    public boolean isValidMove(Move move, Board board) {
        Piece piece = move.getMovedPiece();
        if (piece == null) return false;

        return piece.canMove(board, move.getStart(), move.getEnd());
    }
}

