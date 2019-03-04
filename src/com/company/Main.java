package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputStream input = System.in;
        Scanner readInput = new Scanner(input);

        System.out.println("Welcome to Minesweeper!");
        System.out.println("Please enter the field dimensions: ");

        String dimensions = readInput.nextLine();

        int[] dimensionsAsInt = convertDimensionsInput(dimensions);

        Field field1 = new Field(dimensionsAsInt[0], dimensionsAsInt[1], 5);

        field1.makeHints();

        System.out.print(field1);

    }

    public static int[] convertDimensionsInput(String dimensions) {
        String[] dimensionsInput = dimensions.split("");
        int[] dimensionsAsInt = new int[dimensionsInput.length];
        for(int i = 0; i < dimensionsInput.length; i++) {
            dimensionsAsInt[i] = Integer.parseInt(dimensionsInput[i]);
        }
        return dimensionsAsInt;
    }

}
