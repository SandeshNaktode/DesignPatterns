package LLDSnakeAndLadder;

import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerDeque = new LinkedList<>();

    Player winner;

    Game(){
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        constructPlayers();
    }

    private void constructPlayers(){
        Player player1 = new Player("p1", 0,"Sandesh");
        Player player2 = new Player("p2", 0,"Param");

        playerDeque.add(player1);
        playerDeque.add(player2);
    }

    public void startGame(){
        while (winner == null) {
            Player playerTurn = findPlayerTurn();
            System.out.println(playerTurn.playerName + " its your turn: " + playerTurn.id + " current position: " + playerTurn.currentPosition);

            int diceNumbers = dice.rollDice();

            int newPosition = playerTurn.currentPosition + diceNumbers;
            newPosition = jumpCheck(newPosition);
            playerTurn.currentPosition = newPosition;

            System.out.println(playerTurn.playerName + " its your turn: " + playerTurn.id + " new position: " + playerTurn.currentPosition);

            if(newPosition >= board.cells.length * board.cells.length - 1){
                winner = playerTurn;
            }

        }

        System.out.println("Winner is: " + winner.playerName);
    }

    private Player findPlayerTurn(){
        Player playerTurn = playerDeque.removeFirst();
        playerDeque.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int newPosition){
        if(newPosition > board.cells.length * board.cells.length - 1){
            return newPosition;
        }

        Cell cell = board.getCell(newPosition);
        if(cell.jump != null && cell.jump.start == newPosition){
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("Jump done by: " +jumpBy);
            return cell.jump.end;
        }
        return newPosition;
    }
}
