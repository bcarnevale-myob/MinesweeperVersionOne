package com.company;

import com.company.Square.MineSquare;
import com.company.Square.SafeSquare;
import com.company.Square.Square;

public class Field {

    private final Square[][] field;

    public Square getSquareAt(int row, int column) {
        return field[row][column];
        // throw exception for square outside of field
    }

    // QUESTION: I know String is probably not the best return. I originally had it returning an int, but how do you return two separate ints??
    // split in two
//    public String getFieldSize(Square[][] field) {
//        int rows = field.length;
//        int columns = field[0].length;
//        return "(" + rows + ", " + columns + ")";
//    }

    public int getHeight() {
        return field[0].length;
    }

    public int getWidth() {
        return field.length;
    }

    private Square[][] createField() {
        Square[][] field = new Square[4][4];
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if ((c == 2 && r == 1) || (c == 2 && r == 2)) {
                    field[r][c] = new MineSquare();
                } else {
                    field[r][c] = new SafeSquare();
                }
            }
        }
        return field;
    }

    public Field() {
        this.field = createField();
    }

    public String toString() {
        String result = "";

        for (int r = 0; r < this.field.length; r++) {
            for (int c = 0; c < this.field[r].length; c++) {
                result = result + this.field[r][c].toString();
            }
            if (!(r == this.field.length - 1)) {
                result = result + "\n";
            }
        }
        return result;
    }

    public void makeHints() {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[0].length; c++) {
                for (Position pos : Position.values()) {
                    if (!field[r][c].isSafe()) {
                        Square s = getSquare(pos, r, c);
                        s.IncreaseHint();
                    }
                }

            }
        }
    }

    private Boolean isOutOfBounds(int row, int column) {
        return row < 0 ||
                column < 0 ||
                (row > field.length) ||
                (column > field[0].length);
    }

    //
    private Square getSquare(Position pos, int row, int col) {

        switch (pos) {
            case TOPLEFT:
                if (isOutOfBounds(row - 1, col - 1)) return null;
                return field[row - 1][col - 1];
            case TOP:
                if (isOutOfBounds(row - 1, col)) return null;
                return field[row - 1][col];
            case TOPRIGHT:
                if (isOutOfBounds(row - 1, col + 1)) return null;
                return field[row - 1][col + 1];
            case LEFT:
                if (isOutOfBounds(row, col - 1)) return null;
                return field[row][col - 1];
            case RIGHT:
                if (isOutOfBounds(row, col + 1)) return null;
                return field[row][col + 1];
            case BOTTOMLEFT:
                if (isOutOfBounds(row + 1, col - 1)) return null;
                return field[row + 1][col - 1];
            case BOTTOM:
                if (isOutOfBounds(row + 1, col)) return null;
                return field[row + 1][col];
            case BOTTOMRIGHT:
                if (isOutOfBounds(row + 1, col + 1)) return null;
                return field[row + 1][col + 1];
            default:
                return null;
        }
    }
}
