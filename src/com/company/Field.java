package com.company;

import com.company.Square.MineSquare;
import com.company.Square.SafeSquare;
import com.company.Square.Square;

import java.util.Random;

public class Field {

    private final Square[][] field;
    private final Random randomNumberGenerator;

    public Square getSquareAt(int row, int column) {
        return field[row][column];
    }

    public int getHeight() {
        return field[0].length;
    }

    public int getWidth() {
        return field.length;
    }

    private int[] createMinePositions(int numberOfMines, int fieldDimension) {
        int[] minePositions = new int[numberOfMines];
        for(int i = 0; i < minePositions.length; i++) {
            minePositions[i] = randomNumberGenerator.nextInt(fieldDimension);
        }
        return minePositions;
    }

    private Square[][] createField(int fieldWidth, int fieldHeight, int numberOfMines) {
        Square[][] field = new Square[fieldWidth][fieldHeight];

        // create numberOfMines amount of mineRows and mineColumns
        int[] mineRows = createMinePositions(numberOfMines, fieldWidth);
        int[] mineColumns = createMinePositions(numberOfMines, fieldHeight);

//        int mineRow1 = randomNumberGenerator.nextInt(fieldWidth);
//        int mineColumn1 = randomNumberGenerator.nextInt(fieldHeight);
//        int mineRow2 = randomNumberGenerator.nextInt(fieldWidth);
//        int mineColumn2 = randomNumberGenerator.nextInt(fieldHeight);



        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                boolean isSquareAMine = false;
                for (int i = 0; i < mineRows.length; i++) {
                    if (r == mineRows[i] && c == mineColumns[i]) {
                        isSquareAMine = true;
                    }
                    if (isSquareAMine) {
                        field[r][c] = new MineSquare();
                    } else {
                        field[r][c] = new SafeSquare();
                    }
                }
            }
        }

        return field;
    }

    // TO DO: get it to put in all the number of mines, get it to make sure all random numbers are different

    public Field(int fieldWidth, int fieldHeight, int numberOfMines) {
        this.randomNumberGenerator = new Random();
        this.field = createField(fieldWidth, fieldHeight, numberOfMines);
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
