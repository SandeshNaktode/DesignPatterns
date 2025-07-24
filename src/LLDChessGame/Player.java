package LLDChessGame;

import LLDChessGame.Enum.PeaceColor;

public class Player {
    private String name;
    private PeaceColor peaceColor;

    public Player(String name, PeaceColor peaceColor) {
        this.name = name;
        this.peaceColor = peaceColor;
    }

    public PeaceColor getColor() {
        return peaceColor;
    }

    public String getName() {
        return name;
    }
}
