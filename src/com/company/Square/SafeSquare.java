package com.company;

public class SafeSquare extends Square {
    SafeSquare() {
        squareIcon = ".";
    }

    @Override
    public Boolean isSafe() {
        return true;
    }
}
