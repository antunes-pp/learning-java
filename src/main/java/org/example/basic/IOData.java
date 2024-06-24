package org.example.basic;

import java.util.Scanner;

public class IOData {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insert a integer number:");
    int userValue1 = scanner.nextInt();

    System.out.println("Insert another integer number:");
    int userValue2 = scanner.nextInt();

    System.out.println("----- Calculating -----");

    scanner.close();

    System.out.printf("Total: %d\n", userValue1 + userValue2);
    System.out.printf("Total in decimal: %f", (float) userValue1 / userValue2);
  }
}
