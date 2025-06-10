package LLDTicTacToe;

import LLDTicTacToe.Model.Board;
import LLDTicTacToe.Model.Player;
import LLDTicTacToe.Model.PlayingPiece;
import LLDTicTacToe.Model.PlayingPieceO;
import LLDTicTacToe.Model.PlayingPieceX;

import java.security.PublicKey;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame(){
        //creating 2 Players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        //initializeBoard
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){
            //take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Board.Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player: " +playerTurn.getName() + " Enter row, colums: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if (winner){
                return playerTurn.getName();
            }
        }

        return "tie";
    }

    private boolean isThereWinner(int inputRow, int inputColumn, PlayingPiece playingPiece) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i<gameBoard.getSize();i++) {
            //Columns check
            if (gameBoard.getBoard()[inputRow][i] == null || gameBoard.getBoard()[inputRow][i] != playingPiece) {
                rowMatch = false;
            }
        }

        for(int i=0;i<gameBoard.getSize();i++) {
            //Row check
            if (gameBoard.getBoard()[i][inputColumn] == null || gameBoard.getBoard()[i][inputColumn] != playingPiece) {
                columnMatch = false;
            }
        }

        for(int i=0;i<gameBoard.getSize();i++) {
            //Diagonal Match Check
            if(gameBoard.getBoard()[i][i] == null || gameBoard.getBoard()[i][i] != playingPiece){
                diagonalMatch = false;
            }
        }

        for(int i=0;i<gameBoard.getSize();i++) {
            //Diagonal Match Check
            if(gameBoard.getBoard()[i][gameBoard.getSize() - 1 - i] == null || gameBoard.getBoard()[i][gameBoard.getSize() - 1 - i] != playingPiece){
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
