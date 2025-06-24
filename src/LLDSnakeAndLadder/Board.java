package LLDSnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int numOfSnakes, int numOfLadders) {
        initializeCells(boardSize);

        addSnakeAndLadders(numOfSnakes, numOfLadders);
    }

    private void addSnakeAndLadders(int numOfSnakes, int numOfLadders) {
        while (numOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
            if(snakeTail >= snakeHead) continue;

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;
            numOfSnakes--;
        }
        while(numOfLadders > 0) {
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
            if(ladderTail <= ladderHead) continue;

            Jump ladderObj = new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderTail;

            Cell cell = getCell(ladderHead);
            cell.jump = ladderObj;
            numOfLadders--;
        }
    }

    private void initializeCells(int boardSize) {
        this.cells = new Cell[boardSize][boardSize];

        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                Cell cell = new Cell();
                this.cells[i][j] = cell;
            }
        }
    }

    Cell getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardCol = playerPosition % cells.length;
        return cells[boardRow][boardCol];
    }
}
