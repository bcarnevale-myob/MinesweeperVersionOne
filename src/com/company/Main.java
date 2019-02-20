package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // output BoardFixed class

        String[][] boardFixed = new String[4][4];

        BoardFixed board1 = new BoardFixed(boardFixed);

        // input * into fixed board

//        for (int r=0; r<boardFixed.length; r++) {
//            for (int c=0; c<boardFixed[r].length; c++) {
//                boardFixed[1][1] = "*";
//                boardFixed[2][3] = "*";
//                boardFixed[r][c] = ".";
//            }
//        }

        // QUESTION: why doesnt board[3][3] = "*" work??

//        for (int r=0; r<boardFixed.length; r++) {
//            for (int c=0; c<boardFixed[r].length; c++){
//                System.out.print(boardFixed[r][c]);
//            }
//            System.out.println();
//        }

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

        for (int r=0; r<boardFixed.length; r++) {
            for (int c=0; c<boardFixed[r].length; c++){
                System.out.print(boardFixed[r][c]);
            }
            System.out.println();
        }

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
