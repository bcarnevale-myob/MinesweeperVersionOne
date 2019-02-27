package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Field field1 = new Field(6, 8, 7);

        field1.makeHints();

        System.out.print(field1);

    }

}
