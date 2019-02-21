package com.company;

public class Square {

    private final SquareType squareType;

    public Square(SquareType squareType) {
        this.squareType = squareType;
    }

    Square(String squareType) throws Exception {
        this.squareType = stringToSquareType(squareType);
    }

    @Override
    public boolean equals(Object object) {
        return this.squareType == ((Square)object).squareType;
    }

    public String toString() {
        return this.squareType.toString();
    }

    public static SquareType stringToSquareType(String squareString) throws Exception {
        if (squareString.equals(".")) {
            return SquareType.SAFE;
        } else if (squareString.equals("*")) {
            return SquareType.MINE;
        } else {
            throw new Exception("Valid square types are '.' and '*', received: " + squareString);
        }
    }
}
