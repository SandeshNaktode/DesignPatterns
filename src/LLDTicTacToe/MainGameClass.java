package LLDTicTacToe;

public class MainGameClass {
    public static void main(String args[]) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println("game winner is: " + game.startGame());
    }

}
