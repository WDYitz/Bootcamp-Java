package com.yitzhak.exercice;

import static java.lang.StringTemplate.STR;

import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("unused")
public class InputScanner {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Enter your Name: ");
      String name = scanner.next();

      System.out.println("Enter your Last Name: ");
      String lastName = scanner.next();

      System.out.println("Enter your Age: ");
      int age = scanner.nextInt();

      System.out.println("Enter your Height: ");
      Double height = scanner.nextDouble();

      System.out.println(
          STR."Hi, My Name is \{name} \{lastName} and I am \{age} years old and \{height} meters tall.");
    }
  }
}