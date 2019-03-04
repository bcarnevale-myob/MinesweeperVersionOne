package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InputStream input = System.in;
        Scanner readInput = new Scanner(input);

        System.out.println("Welcome to Minesweeper!");
        System.out.println("Please enter your game field dimensions: ");

        String dimensions = readInput.nextLine();

        int[] dimensionsAsInt = convertDimensionsInput(dimensions);
        int numberOfRows = dimensionsAsInt[0];
        int numberOfCols = dimensionsAsInt[1];

        System.out.println("Please enter your game field with mines, splitting rows with a ',': ");

        String fieldInput = readInput.nextLine();

        String[][] userField = convertFieldInput(numberOfRows, numberOfCols, fieldInput);

        Field newField = new Field(numberOfRows, numberOfCols, userField);

        newField.makeHints();

        System.out.println("Field #1:");
        System.out.print(newField);

    }

    // QUESTION: Tried to add .trim but it did not work??
    public static int[] convertDimensionsInput(String dimensions) {
        String[] dimensionsInput = dimensions.split("");
        int[] dimensionsAsInt = new int[dimensionsInput.length];
        for(int i = 0; i < dimensionsInput.length; i++) {
            dimensionsAsInt[i] = Integer.parseInt(dimensionsInput[i]);
        }
        return dimensionsAsInt;
    }

    private static String[][] convertFieldInput(int numberOfRows, int numberOfCol, String fieldInput) {
        String[] createFieldRows = fieldInput.split(",");
        String[][] createField = new String[numberOfRows][numberOfCol];
        for(int i = 0; i < createFieldRows.length; i++) {
            createField[i] = createFieldRows[i].split("");
        }
        return createField;
    }

}
