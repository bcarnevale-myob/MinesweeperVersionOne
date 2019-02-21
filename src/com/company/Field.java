package com.company;

public class Field {
    
    private final Square[][] field;

    public Square getSquareAt(int row, int column){
        return field[row][column];
        // throw exception for square outside of field
    }

    // QUESTION: I know String is probably not the best return. I originally had it returning an int, but how do you return two separate ints??
    public String getFieldSize(Square[][] field) {
        int rows = field.length;
        int columns = field[0].length;
        return "(" + rows + ", " + columns + ")";
    }

    private Square[][] createField() throws Exception {
        Square[][] field = new Square[4][4];
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                if ((c == 2 && r == 1) || (c == 2 && r == 2)) {
                    field[r][c] = new Square("*");
                } else {
                    field[r][c] = new Square(".");
                }
            }
        }
        return field;
    }

    public Field() throws Exception {
        this.field = createField();
    }

    public String toString() {
        String result = "";
        for (int r = 0; r < this.field.length; r++) {
            for (int c = 0; c < this.field[r].length; c++) {
                result = result + this.field[r][c].toString();
            }
            if (!(r == this.field.length -1)) {
                result = result + "\n";
            }
        }
        return result;
    }

}
