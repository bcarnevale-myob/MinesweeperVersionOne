package com.company;

public class Square {

    private final SquareType squareType;

    public Square(SquareType squareType) {
        this.squareType = squareType;
    }

    Square(String squareType) throws Exception {
        if (squareType.equals(".")) {
            this.squareType = SquareType.SAFE;
        } else if (squareType.equals("*")) {
            this.squareType = SquareType.MINE;
        } else {
            throw new Exception("Valid square types are '.' and '*', received: " + squareType);
        }
    }

    @Override
    public boolean equals(Object object) {
        return this.squareType == ((Square)object).squareType;
    }
}
