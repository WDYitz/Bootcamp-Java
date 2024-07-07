package com.yitzhak.firstweek.exceptions;

import static java.lang.StringTemplate.STR;

import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
    System.out.println("Hello, I'm Yitzhak!");

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite seu nome: ");
      String name = scanner.next();

      System.out.println("Digite sua idade: ");
      int age = scanner.nextInt();

      System.out.println("Digite seu peso: ");
      double weight = scanner.nextDouble();

      System.out.println("Digite sua altura: ");
      double height = scanner.nextDouble();


    } catch (Exception e) {
     System.out.println(STR."Erro ao ler os dados. Tente novamente. \{e.getMessage()}");
    }
  }
}