package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // output BoardFixed class

        String[][] boardFixed = new String[4][4];

        BoardFixed board1 = new BoardFixed(boardFixed);

        // QUESTION: I feel as though line 11 and 13, something is not necessary there?

        for (int r=0; r<boardFixed.length; r++) {
            for (int c=0; c<boardFixed[r].length; c++){
                System.out.print(boardFixed[r][c]);
            }
            System.out.println();
        }

        BoardFixedHints board2 = new BoardFixedHints(boardFixed);

        // QUESTION: I tried to change the below to loop through board2 and the method length stopped working

        for (int r=0; r<boardFixed.length; r++) {
            for (int c=0; c<boardFixed[r].length; c++){
                System.out.print(boardFixed[r][c]);
            }
            System.out.println();
        }

        // method to print current board - QUESTION: why does this method not work?

        /*public String printCurrentBoard(){
            for (int r=0; r<boardFixed.length; r++) {
                for (int c=0; c<boardFixed[r].length; c++){
                    System.out.print(boardFixed[r][c]);
                }
                System.out.println();
            }
        }

        printCurrentBoard();*/

        // print fixed board to screen

//        boardFixed[0][0] = "1";
//        boardFixed[0][1] = "1";
//        boardFixed[0][2] = "1";
//        boardFixed[0][3] = "0";
//        boardFixed[1][0] = "1";
//        boardFixed[1][2] = "2";
//        boardFixed[1][3] = "1";
//        boardFixed[2][0] = "1";
//        boardFixed[2][1] = "1";
//        boardFixed[2][2] = "2";
//        boardFixed[3][0] = "0";
//        boardFixed[3][1] = "0";
//        boardFixed[3][2] = "1";
//        boardFixed[3][3] = "1";

        // input and print board with fixed hints

        /*for (int r=0; r<boardFixed.length; r++) {
            for (int c=0; c<boardFixed[r].length; c++) {
                if (boardFixed[r][c] != "*") {
                    boardFixed[r][c] = "1";
                }
                System.out.print(boardFixed[r][c]);
            }
            System.out.println();
        }*/


    }
}
