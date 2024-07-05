package com.yitzhak.firstweek.conditionals;

public class Conditionals {
  public static void main(String[] args) {
    boolean conditional = true;
    if (conditional) {
      System.out.println("Verdadeiro");
    } else {
      System.out.println("Falso");
    }

    int nota = 6;
    if (nota >= 7)
      System.out.println("Aprovado");
    else
      System.out.println("Reprovado");

    int number = 10;
    if (number % 2 == 0) {
      System.out.println("Numero Par");
    } else {
      System.out.println("Numero ímpar");
    }

    // TERNARIO 
    int age = 18;
    String resultado = (age >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(resultado);
  }
}
