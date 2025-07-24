package LLDChessGame;

import LLDChessGame.Enum.PeaceColor;

public abstract class Piece {
    private final PeaceColor peaceColor;
    private boolean killed = false;

    public Piece(PeaceColor peaceColor) {
        this.peaceColor = peaceColor;
    }

    public PeaceColor getColor() {
        return peaceColor;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public boolean isKilled() {
        return killed;
    }

    public abstract boolean canMove(Board board, Cell start, Cell end);
}

