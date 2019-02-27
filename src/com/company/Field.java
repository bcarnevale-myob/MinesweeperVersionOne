package com.company;

import com.company.Square.MineSquare;
import com.company.Square.SafeSquare;
import com.company.Square.Square;

public class Field {

    private final Square[][] field;

    public Square getSquareAt(int row, int column) {
        return field[row][column];
    }

    public int getHeight() {
        return field[0].length;
    }

    public int getWidth() {
        return field.length;
    }

    private int findRandomPosition(int fieldSize) {
        return (int) Math.floor(Math.random() * fieldSize);
    }

    private Square[][] createField(int fieldSize) {
        Square[][] field = new Square[fieldSize][fieldSize];
        int mineRow1 = findRandomPosition(fieldSize);
        int mineColumn1 = findRandomPosition(fieldSize);
        int mineRow2 = findRandomPosition(fieldSize);
        int mineColumn2 = findRandomPosition(fieldSize);
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if ((r == mineRow1 && c == mineColumn1) || (r == mineRow2 && c == mineColumn2)) {
                    field[r][c] = new MineSquare();
                } else {
                    field[r][c] = new SafeSquare();
                }
            }
        }
        return field;
    }

    public Field(int fieldSize) {
        this.field = createField(fieldSize);
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
                    Square s = getSquare(pos, r, c);
                    if (s != null && !field[r][c].isSafe()) {
                        s.IncreaseHint();
                    }
                }

            }
        }
    }

    private Boolean isOutOfBounds(int row, int column) {
        return row < 0 ||
                column < 0 ||
                (row >= field.length) ||
                (column >= field[0].length);
    }

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
