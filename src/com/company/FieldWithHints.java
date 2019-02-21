package com.company;

public class FieldWithHints {

    // accessor

    // MINE VALUE is in int associated to if that square is a mine
    public static final int MINE_VALUE = -1;

    // similar to field, with int (same methods essentially, diff return types)

    private final int[][] fieldWithHints;

    private int[][] convertToFieldOfInts(Square[][] field) throws Exception {
        // given field of squares, convert to field of ints
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if (field[r][c].equals(SquareType.SAFE)) {

            }
        }
    }

        // check if the square is SAFE or a MINE
        // if SAFE, change value to 0
        // if adjacent to a MINE, +1 to the value of the square, cant go above 8

        // measure if the square is either side of a MINE
        // measure if the square is above or below a MINE
        // measure if the square is diagonal to a MINE

//    private Square[][] fieldWithHints;
//
//    public FieldWithHints(Square[][] fieldWithHints) throws Exception {
//        this.fieldWithHints = createFieldWithHints(fieldWithHints);
//    }
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




//    private final Square[][] fieldWithHints;

//    public int changeSquareValue(Square squareType) throws Exception {
//        int squareValue;
//        if (squareType.equals(SquareType.SAFE)) {
//            // squareValue = Integer.parseInt(squareType.squareValue);
//            squareValue = 0;
//        } else if (squareType.equals(SquareType.MINE)) {
//            squareValue = 55;
//            System.out.print("cool");
//        } else {
//            throw new Exception("Valid square types are SAFE and MINE, received: " + squareType);
//        }
//        return squareValue;
//    }


//
//     QUESTION: There must be a way of checking the below method against the SquareType (SAFE or MINE) rather than value?
//
//    public Square[][] createFieldWithHints(Square[][] field) throws Exception {
////         measure if the square is either side of a MINE
//        for (int r=0; r<field.length; r++) {
//            for (int c=0; c<field[r].length; c++){
//                if (field[r - 1][c - 1].squareValue().equals("*") || field[r - 1][c - 1].squareValue().equals("*")) {
//                    field[r][c] = new Square("1");
//                }
//            }
//        }
//
//        for (int r=0; r<field.length; r++) {
//            for (int c=0; c<field[r].length; c++){
//                if (field[r][c].equals(SquareType.SAFE)) {
//
//                }
//            }
//        }
//
//        return fieldWithHints;
//    }
//
//    public FieldWithHints(Square[][] field) throws Exception {
//        this.fieldWithHints = createFieldWithHints(field);
//    }

}
