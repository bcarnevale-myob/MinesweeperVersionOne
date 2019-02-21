package com.company;

public class FieldWithHints {

    private final Square[][] fieldWithHints;

    public Square[][] createFieldWithHints(Square[][] field) {
        // measure if the square is either side of a MINE
        
        // measure if the square is above or below a MINE

        // measure if the square is diagonal to a MINE
    }

    public FieldWithHints(Square[][] field) {
        this.fieldWithHints = createFieldWithHints(field);
    }

}
