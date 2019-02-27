package com.company.Square;

@SuppressWarnings("WeakerAccess")
public abstract class Square {

    protected String squareIcon;
    protected Boolean isSafe = true;

    private int hint = 0;

    public void IncreaseHint() {
        hint++;
    }

    // QUESTION: Why did this have to be integer instead of just int?
    public Integer GetHint() {
        return hint;
    }

    // QUESTION: Why the capital Boolean instad of lowercase?
    public Boolean isSafe() {
        return isSafe;
    }

    @Override
    public boolean equals(Object object) {
        return this.squareIcon.equals(((Square) object).squareIcon);
    }

    @Override
    public String toString() {
        return this.squareIcon;
    }
}

