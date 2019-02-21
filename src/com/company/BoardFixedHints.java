package com.company;

public class BoardFixedHints {

    private final String[][] boardWithHints;

    // measure if this square is next to *

    private String[][] createBoardWithHints(String[][] board){
        board[0][0] = "1";
        board[0][1] = "1";
        board[0][2] = "1";
        board[0][3] = "0";
        board[1][0] = "1";
        board[1][1] = "2";
        board[1][3] = "1";
        board[2][0] = "1";
        board[2][1] = "1";
        board[2][2] = "2";
        board[3][0] = "0";
        board[3][1] = "0";
        board[3][2] = "1";
        board[3][3] = "1";
        return board;
    }

    public BoardFixedHints(String[][] board) {
        this.boardWithHints = createBoardWithHints(board);
    }
}
