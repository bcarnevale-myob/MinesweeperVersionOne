package com.company;

import com.company.Square.MineSquare;
import com.company.Square.Square;

public class Main {

    public static void main(String[] args) throws Exception {

        Field field1 = new Field();

        field1.makeHints();

        System.out.print(field1);


//        System.out.print(field1.getSquareAt());

        // expecting a Square[][] object but receives a Field, not sure how to change
//        FieldWithHints fieldWithHints1 = new FieldWithHints(field1);
//
//        System.out.print(fieldWithHints1);

    }

}
