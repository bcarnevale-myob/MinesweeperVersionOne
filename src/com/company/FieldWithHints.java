package com.company;

public class FieldWithHints {

    private final Square[][] fieldWithHints;

    public Square[][] createFieldWithHints(Square[][] field) throws Exception {
        // measure if the square is either side of a MINE
        for (int r=0; r<field.length; r++) {
            for (int c=0; c<field[r].length; c++){
                if (field[r - 1][c - 1].squareValue().equals("*") || field[r - 1][c - 1].squareValue().equals("*")) {
                    field[r][c] = new Square("1");
                }
            }
        }

        // measure if the square is above or below a MINE

        // measure if the square is diagonal to a MINE
        return field;
    }

    public FieldWithHints(Square[][] field) throws Exception {
        this.fieldWithHints = createFieldWithHints(field);
    }

}
