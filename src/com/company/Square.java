package com.company;

public class Square {

    public final SquareType squareType;
    public String value;

    public Square(SquareType squareType) {
        this.squareType = squareType;
    }

    // QUESTION: is the below method necessary? I could not pull out the actual string value * or . to print??

    public String squareValue() throws Exception {
        if(this.squareType.equals(SquareType.SAFE)) {
            this.value = ".";
        } else if(this.squareType.equals(SquareType.MINE)) {
            this.value = "*";
        } else {
            throw new Exception("Valid square types are SAFE and MINE, received: " + value);
        }
        return this.value;
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
