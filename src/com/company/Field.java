package com.company;

public class Field {
    
    private final Square[][] field;

    private Square[][] createField(Square[][] field) throws Exception {
        Square safeSquare = new Square(".");
        Square mineSquare = new Square("*");
        for (int r=0; r<field.length; r++) {
            for (int c=0; c<field[r].length; c++) {
                if ((c == 2 && r == 1) || (c == 3 && r == 2)) {
                    field[r][c] = mineSquare;
                } else {
                    field[r][c] = safeSquare;
                }
            }
        }
        return field;
    }

    public Field(Square[][] field) throws Exception {
        this.field = createField(field);
    }

}
