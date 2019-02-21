package com.company;

public class FieldWithHints {

    // similar to field, with int (same methods essentially, diff return types)

    // MINE VALUE is in int associated to if that square is a mine
    public static final int MINE_VALUE = -1;
    private final int[][] fieldWithHints;

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

    public boolean inRange(int row, int column) {
        // needs to check in all directions
        return (0 <= row && row < fieldWithHints.length) && (0 <= column && column < fieldWithHints.length);
    }



        // check if the square is SAFE or a MINE
        // if SAFE, change value to 0
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

