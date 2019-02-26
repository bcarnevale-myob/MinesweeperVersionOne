package com.company.Square;

public class SafeSquare extends Square {

    public SafeSquare() {
        squareIcon = ".";
    }

    @Override
    public Boolean isSafe() {
        return true;
    }

    @Override
    public String toString() {
        return super.GetHint().toString();
    }

}

// return dots and star
// return hints
