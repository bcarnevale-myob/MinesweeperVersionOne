package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // attempt one

        /* String[][] board = {
                {".", ".", ".", "."},
                {".", "*", ".", "."},
                {".", ".", ".", "*"},
                {".", ".", "*", "."}
        };

        for (String[] i: board) {
            for (String data: i){
                System.out.println(data);
            }
//            System.out.println(Arrays.deepToString(i));
        } */

        // attempt two

        String[][] board = new String[4][4];

        for (int r=0; r<board.length; r++) {
            for (int c=0; c<board[r].length; c++) {
                board[r][c] = ".";
            }
        }

        for (String[] i: board) {
            for (String data: i){
                System.out.println(data);
            }
        }

    }
}
