package LLDChessGame;

public class Move {
    private Player player;
    private Cell start;
    private Cell end;
    private Piece pieceMoved;
    private Piece pieceKilled;

    public Move(Player player, Cell start, Cell end) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
        this.pieceKilled = end.getPiece();
    }

    public boolean isCastlingMove() {
        // Logic for castling
        return false;
    }

    public Player getPlayer() {
        return player;
    }

    public Cell getStart() {
        return start;
    }

    public Cell getEnd() {
        return end;
    }

    public Piece getMovedPiece() {
        return pieceMoved;
    }

    public Piece getKilledPiece() {
        return pieceKilled;
    }
}

