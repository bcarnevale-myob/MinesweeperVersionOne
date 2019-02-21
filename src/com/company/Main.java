package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        // output BoardFixed class

        Square[][] newField = new Square[4][4];

        Field field1 = new Field(newField);

        // QUESTION: Why does the below take newField and not field1??

        for (int r=0; r<newField.length; r++) {
            for (int c=0; c<newField[r].length; c++){
                System.out.print(newField[r][c]);
            }
            System.out.println();
        }

//        Square mySquare = new Square(".");
//        Square myOtherSquare = new Square(".");
//        if (myOtherSquare.equals(mySquare)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");
//        }

//        String[][] boardFixed = new String[4][4];
//
//        BoardFixed board1 = new BoardFixed(boardFixed);

        // QUESTION: I feel as though line 11 and 13, something is not necessary there?
//
//        for (int r=0; r<boardFixed.length; r++) {
//            for (int c=0; c<boardFixed[r].length; c++){
//                System.out.print(boardFixed[r][c]);
//            }
//            System.out.println();
//        }

//        BoardFixedHints board2 = new BoardFixedHints(boardFixed);

        // QUESTION: I tried to change the below to loop through board2 and the method length stopped working

//        for (int r=0; r<boardFixed.length; r++) {
//            for (int c=0; c<boardFixed[r].length; c++){
//                System.out.print(boardFixed[r][c]);
//            }
//            System.out.println();
//        }

        // method to print current board - QUESTION: why does this method not work?

        /*public String[][] printCurrentBoard(String[][] board){
            for (int r=0; r<board.length; r++) {
                for (int c=0; c<board[r].length; c++){
                    System.out.print(board[r][c]);
                }
                System.out.println();
            }
        }

        printCurrentBoard(board1);*/

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
