package LLDChessGame;

import LLDChessGame.Enum.PeaceColor;

public class MainGame {
    public static void main(String[] args) {
        Player white = new Player("Alice", PeaceColor.BLACK);
        Player black = new Player("Bob", PeaceColor.WHITE);

        ChessGame game = new ChessGame(white, black);

        // Example moves (you would usually read input or UI events)
        Cell start = game.getBoard().getCell(1, 4); // Assume Pawn
        Cell end = game.getBoard().getCell(2, 4);
        Move move = new Move(white, start, end);

        game.makeMove(move);
    }
}

