package LLDChessGame;

import LLDChessGame.Enum.PeaceColor;
import LLDChessGame.Pieces.Bishop;
import LLDChessGame.Pieces.King;
import LLDChessGame.Pieces.Knight;
import LLDChessGame.Pieces.Pawn;
import LLDChessGame.Pieces.Queen;
import LLDChessGame.Pieces.Rook;

public class Board {
    private final Cell[][] cells = new Cell[8][8];

    public Board() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                cells[i][j] = new Cell(i, j);
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public void resetBoard() {
        // Initialize empty cells
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }

        // Place white pieces
        cells[0][0].setPiece(new Rook(PeaceColor.WHITE));
        cells[0][1].setPiece(new Knight(PeaceColor.WHITE));
        cells[0][2].setPiece(new Bishop(PeaceColor.WHITE));
        cells[0][3].setPiece(new Queen(PeaceColor.WHITE));
        cells[0][4].setPiece(new King(PeaceColor.WHITE));
        cells[0][5].setPiece(new Bishop(PeaceColor.WHITE));
        cells[0][6].setPiece(new Knight(PeaceColor.WHITE));
        cells[0][7].setPiece(new Rook(PeaceColor.WHITE));

        for (int j = 0; j < 8; j++) {
            cells[1][j].setPiece(new Pawn(PeaceColor.WHITE));
        }

        // Place black pieces
        cells[7][0].setPiece(new Rook(PeaceColor.BLACK));
        cells[7][1].setPiece(new Knight(PeaceColor.BLACK));
        cells[7][2].setPiece(new Bishop(PeaceColor.BLACK));
        cells[7][3].setPiece(new Queen(PeaceColor.BLACK));
        cells[7][4].setPiece(new King(PeaceColor.BLACK));
        cells[7][5].setPiece(new Bishop(PeaceColor.BLACK));
        cells[7][6].setPiece(new Knight(PeaceColor.BLACK));
        cells[7][7].setPiece(new Rook(PeaceColor.BLACK));

        for (int j = 0; j < 8; j++) {
            cells[6][j].setPiece(new Pawn(PeaceColor.BLACK));
        }
    }
}
