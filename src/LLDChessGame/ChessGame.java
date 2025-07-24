package LLDChessGame;

import LLDChessGame.Enum.GameStatus;

import java.util.*;

public class ChessGame {
    private Board board;
    private List<Player> players;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> moveHistory;
    private MoveValidator validator;

    public ChessGame(Player p1, Player p2) {
        this.players = Arrays.asList(p1, p2);
        this.currentTurn = p1;
        this.board = new Board();
        this.status = GameStatus.ACTIVE;
        this.moveHistory = new ArrayList<>();
        this.validator = new MoveValidator();
        board.resetBoard();
    }

    public boolean makeMove(Move move) {
        if (!validator.isValidMove(move, board)) {
            System.out.println("Invalid move!");
            return false;
        }

        Cell start = move.getStart();
        Cell end = move.getEnd();
        Piece killed = end.getPiece();

        end.setPiece(start.getPiece());
        start.setPiece(null);

        if (killed != null) {
            killed.setKilled(true);
        }

        moveHistory.add(move);
        switchTurn();
        return true;
    }

    private void switchTurn() {
        currentTurn = (currentTurn == players.get(0)) ? players.get(1) : players.get(0);
    }

    public boolean isGameOver() {
        return status != GameStatus.ACTIVE;
    }

    public Board getBoard() {
        return this.board;
    }
}