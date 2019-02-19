package com.company;

public class BoardFixed {

    // create a board with fixed positions

    String[][] board = {
            {".", ".", ".", "."},
            {".", "*", ".", "."},
            {".", ".", ".", "*"},
            {".", ".", "*", "."}
    };

    public BoardFixed() {
        System.out.print(board);
    }


//    String[][] board = new String[4][4];
//
//    int i = 0;
//    for(i=0, i<=4, i++){
//        if(i==1 || i==3){
//            board[i] = "*";
//        }
//        board[i] = ".";
//    }

}
