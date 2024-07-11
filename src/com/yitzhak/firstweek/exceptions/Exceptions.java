package com.yitzhak.firstweek.exceptions;

import static java.lang.StringTemplate.STR;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Exceptions {
  public static void main(String[] args) {
    try {
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Calculo de IMC");

        System.out.println("Digite seu peso: ");
        double weight = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double height = scanner.nextDouble();

        System.out.println(STR."Seu IMC: \{(weight / (height * height))}");
      }

    } catch (Exception e) {
     System.out.println(STR."Erro ao ler os dados. Tente novamente. \{e.getMessage()}");
    }
  }
}