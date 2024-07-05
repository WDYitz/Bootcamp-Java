package com.yitzhak.firstweek.looping;

import static java.lang.StringTemplate.STR;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("unused")
public class Looping {
  public static void main(String[] args) {
    String alunos[] = { "Yitzhak", "Lucas", "Silva", "Roberto", "Henrique" };

    // FOR EACH
    for (String aluno : alunos) {
      System.out.println(aluno);
    }

    // FOR
    for (int i = 0; i < alunos.length; i++) {
      System.out.println(alunos[i]);
    }

    // BREAK E CONTINUE
    for (int i = 0; i < alunos.length; i++) {
      if (i == 1)
        continue;
      if (i >= 3)
        break;
      System.out.println(alunos[i]);
    }

    // WHILE
    double mesada = 50.0;
    while (mesada > 0) {
      double valorDoce = valorAleatorio();
      if (valorDoce > mesada)
        valorDoce = mesada;

      System.out.println(STR."Doce do valor: \{valorDoce} adicionado ao carrinho");
      mesada -= valorDoce;
    }
    System.out.println(STR."Mesada: \{mesada}");
    System.out.println(STR."Joãozinho gastou toda sua mesada.");

    // DO WHILE
    do {
      System.out.println("Telefone Tocandoo...");
    } while (tocando());
  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println(STR."Atendeu? \{atendeu}");

    return !atendeu;
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
