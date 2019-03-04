package com.company;

import com.company.Square.MineSquare;
import com.company.Square.SafeSquare;
import com.company.Square.Square;

import java.util.Random;

public class Field {

    private final Square[][] field;
    private Random randomNumberGenerator;

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

    private Square[][] createRandomField(int fieldWidth, int fieldHeight, int numberOfMines) {
        Square[][] field = new Square[fieldWidth][fieldHeight];

        int[] mineRows = createMinePositions(numberOfMines, fieldWidth);
        int[] mineColumns = createMinePositions(numberOfMines, fieldHeight);

        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                boolean isSquareAMine = false;
                for (int i = 0; i < mineRows.length; i++) {
                    if (r == mineRows[i] && c == mineColumns[i]) {
                        isSquareAMine = true;
                    }
                }
                if (isSquareAMine) {
                    field[r][c] = new MineSquare();
                } else {
                    field[r][c] = new SafeSquare();
                }
            }
        }

        return field;
    }

    public Field(int fieldWidth, int fieldHeight, int numberOfMines) {
        this.randomNumberGenerator = new Random();
        this.field = createRandomField(fieldWidth, fieldHeight, numberOfMines);
    }


    // TO DO: get it to make sure all random numbers are different
    // TO DO: get it to randomise the number of mines

    private Square[][] createFieldFromUser(int fieldWidth, int fieldHeight, String[][] userField) {
        Square[][] field = new Square[fieldWidth][fieldHeight];

        for(int r = 0; r < userField.length; r++) {
            for(int c = 0; c < userField[r].length; c++) {
                if (userField[r][c].equals("*")) {
                    field[r][c] = new MineSquare();
                } else {
                    field[r][c] = new SafeSquare();
                }
            }
        }
        return field;
    }

    public Field(int fieldWidth, int fieldHeight, String[][] userField) {
        this.field = createFieldFromUser(fieldWidth, fieldHeight, userField);
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
