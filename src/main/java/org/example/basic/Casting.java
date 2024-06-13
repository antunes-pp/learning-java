package org.example.basic;

public class Casting {
    public static void main(String[] args) {
        // Implicit
        short tinyValue = 1;
        int space = tinyValue;

        // Narrowing
        long longValue = 232;
        space = (int) longValue;

        System.out.println(space);
    }
}
