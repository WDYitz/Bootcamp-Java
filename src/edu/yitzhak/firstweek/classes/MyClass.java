package edu.yitzhak.firstweek.classes; // Convensão de pacotes Java

import static java.lang.StringTemplate.STR; // Template string method

public class MyClass {
  public static void main(String[] args) {
    String firstName = "Yitzhak";
    String lastName = "Rodriguez";

    String nomeCompleto = fullName(firstName, lastName);

    System.out.println(nomeCompleto);
  }

  public static String fullName(String firstName, String lastName) {
    return STR."Hello, My Name is \{firstName} \{lastName}";
  }
}
