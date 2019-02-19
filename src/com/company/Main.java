package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // output the board

        String[][] board = {
                {".", ".", ".", "."},
                {".", "*", ".", "."},
                {".", ".", ".", "*"},
                {".", ".", "*", "."}
        };

        for (String[] i: board) {
            System.out.println(Arrays.deepToString(i));
        }

    }
}
