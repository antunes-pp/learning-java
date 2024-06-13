package org.example.basic;

public class Variable {
    public static void main(String[] args) {
        int day = 13;
        int month = 6;
        int year = 2024;

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);

        day = 22;
        month = 12;
        year = 1996;

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);

        char justA = 65;
        System.out.println(justA);

        justA = 'B';
        System.out.println(justA);

        float liquid = 2.5F;
        System.out.println(liquid + 1);

        double withdraw = 7.8;
        System.out.println(withdraw + liquid);

        int count = 0;
        count += 11; // ++, -- -=
        System.out.println(count);

        System.out.println(count > (liquid - 2));
    }
}
