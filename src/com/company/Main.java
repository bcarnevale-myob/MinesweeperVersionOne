package com.company;

public class Main {

    public static void main(String[] args) throws Exception {


        Field field1 = new Field();

        System.out.print(field1);

//        FieldWithHints fieldWithHints1 = new FieldWithHints(newField1);

        // QUESTION: Why does the below take newField and not field1??

        // QUESTION: The way I am going about this is probably wrong because it is changing the version of the instance, isn't it?

//        printCurrentField(newField1);

    }

}
