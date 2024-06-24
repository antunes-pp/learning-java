package org.example.basic;

public class Casting {
    public static void main(String[] args) {
        // Implicit
        int space = (short) 1;

        // Narrowing
        long longValue = 232;
        space = (int) longValue;

        System.out.println(space);

        // Division
        int valOne = 9;
        int valTwo = 2;

        float result = (float) valOne / valTwo;

        System.out.println(result);
    }
}
