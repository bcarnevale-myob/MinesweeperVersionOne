package com.company;

public class BoardFixed {

    private final String[][] board;

    private String[][] createBoard(String[][] board) {
        for (int r=0; r<board.length; r++) {
            for (int c=0; c<board[r].length; c++) {
                board[1][1] = "*";
                board[2][3] = "*";
                board[r][c] = ".";
            }
        }
        return board;
    }

    // QUESTION: why doesnt board[3][3] = "*" work??

    public BoardFixed(String[][] board) {
        this.board = createBoard(board);
    }

}
