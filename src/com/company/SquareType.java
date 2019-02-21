package com.company;

public enum SquareType {
    SAFE {
        public String toString() {
           return ".";
        }
    },
    MINE {
        public String toString() {
            return "*";
        }
    }
}

// string to squaretype method
