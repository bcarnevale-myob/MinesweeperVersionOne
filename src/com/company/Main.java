package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // output BoardFixed class

        String[][] board = new String[4][4];

        for (int r=0; r<board.length; r++) {
            for (int c=0; c<board[r].length; c++) {
                board[1][1] = "*";
                board[2][3] = "*";
                board[r][c] = ".";
            }
        }

        // QUESTION: why doesnt board[3][3] = "*" work??

        for (int r=0; r<board.length; r++) {
            for (int c=0; c<board[r].length; c++){
                System.out.print(board[r][c]);
            }
            System.out.println();
        }

    }
}
