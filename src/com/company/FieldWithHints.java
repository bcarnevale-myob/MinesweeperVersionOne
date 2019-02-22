package com.company;

public class FieldWithHints {

    // similar to field, with int (same methods essentially, diff return types)

    // MINE VALUE is in int associated to if that square is a mine
    public static final int MINE_VALUE = -1;
    private final int[][] fieldWithHints;

    // check if the square is SAFE or a MINE
    // if SAFE, change value to 0
    private int[][] convertToFieldOfInts(Square[][] field) throws Exception {
        // given field of squares, convert to field of ints
        int[][] hintField = new int[4][4];
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if (field[r][c].toString().equals(".")) {
                    hintField[r][c] = 0;
                } else if (field[r][c].toString().equals("*")) {
                    hintField[r][c] = MINE_VALUE;
                } else {
                    throw new Exception("Valid square types are . and *, received: " + field[r][c].toString());
                }
            }
        }
        return hintField;
    }

    // NEED TO DO
    // get the current square
    // go around all 8 adjacent squares and check if they are in range
    // if an adjacent square is a MINE, +1 to the value of the current square

    // all adjacent squares index values, currentSquare [r][c]
    // rightBottom: [r+1][c+1]
    // right: [r+1][c]
    // rightTop: [r+1][c-1]
    // above: [r][c-1]
    // leftTop: [r-1][c-1]
    // left: [r-1][c]
    // leftBottom: [r-1][c+1]
    // below: [r][c+1]

    // method to add 1 to a square if a mine is adjacent
    // if adjacent to a MINE, +1 to the value of the square, cant go above 8

    private int[][] getFieldWithHints(Square[][] field) throws Exception {
        int[][] hintField = convertToFieldOfInts(field);
        for (int r = 0; r < hintField.length; r++) {
            for (int c = 0; c < hintField[r].length; c++) {
                if (!(hintField[r][c] == -1)) {
                    // now we have a safe square, check all adjacent squares, +1 if adjacent square is a mine
                    
                }
            }
        }
        return hintField;
    }

    public boolean inRange(int row, int column) {
        // needs to check in all directions
        return (0 <= row && row < fieldWithHints.length) && (0 <= column && column < fieldWithHints.length);
    }

        // if adjacent to a MINE, +1 to the value of the square, cant go above 8

        // measure if the square is either side of a MINE
        // measure if the square is above or below a MINE
        // measure if the square is diagonal to a MINE

//
//    public boolean inRange(int row, int column) {
//        // needs to check in all directions
//        return (0 <= row && row < fieldWithHints.length) && (0 <= column && column < fieldWithHints.length);
//    }
//
//    public int[][] createFieldWithHints(Field field) throws Exception {
//        for (int r = 0; r < field.length; r++) {
//            for (int c = 0; c < field[r].length; c++) {
//                if (inRange(r, c)) {
//                    if (field[r - 1][c - 1].squareValue().equals("*") || field[r + 1][c + 1].squareValue().equals("*")) {
//                        field[r][c] = new Square("1");
//                    }
//                }
//            }
//        }
//        return field;
    }

