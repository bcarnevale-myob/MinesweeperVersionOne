package com.company;

import com.company.Square.Square;

public class FieldWithHints {

    public static final int MINE_VALUE = -1; // int associated to that square if it is a mine
    // QUESTION: why is it not finding this when I use it below??
//    private final int[][] fieldWithHints;
//
//    public boolean inRange(int row, int column) {
//        // needs to check in all directions
//        return (0 <= row && row < fieldWithHints.length) && (0 <= column && column < fieldWithHints.length);
//    }

    // all adjacent squares index values, currentSquare [r][c]
    // rightBottom: [r+1][c+1]
    // right: [r+1][c]
    // rightTop: [r+1][c-1]
    // above: [r][c-1]
    // leftTop: [r-1][c-1]
    // left: [r-1][c]
    // leftBottom: [r-1][c+1]
    // below: [r][c+1]

    // NEED TO DO
    // get the current square
    // go around all 8 adjacent squares and check if they are in range
    // if an adjacent square is a MINE, +1 to the value of the current square
    // make sure square int does not go above 8

    private void getFieldWithHints(Square[][] field) throws Exception {

    }

}

