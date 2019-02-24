package com.company.Square;

public class MineSquare extends Square {
    public MineSquare() {
        this.squareIcon = "*";
        this.isSafe = false;
    }

    @Override
    public Boolean isSafe() {
        return false;
    }
}

