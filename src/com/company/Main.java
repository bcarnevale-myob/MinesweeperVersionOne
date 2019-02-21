package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        // output BoardFixed class

        Square[][] newField1 = new Square[4][4];

        Field field1 = new Field(newField1);

        printCurrentBoard(newField1);

        FieldWithHints fieldWithHints1 = new FieldWithHints(newField1);

        // QUESTION: Why does the below take newField and not field1??

        printCurrentBoard(newField1);

    }

    public static void printCurrentBoard(Square[][] field) throws Exception {
        for (int r=0; r<field.length; r++) {
            for (int c=0; c<field[r].length; c++){
                System.out.print(field[r][c].squareValue());
            }
            System.out.println();
        }
    }

}
