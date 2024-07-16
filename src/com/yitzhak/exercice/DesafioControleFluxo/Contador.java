package com.yitzhak.exercice.DesafioControleFluxo;

import java.util.Scanner;

import com.yitzhak.exercice.DesafioControleFluxo.Errors.ParametrosInvalidosException;

public class Contador {
  public static void main(String[] args) {
    try (Scanner terminal = new Scanner(System.in)) {
      int primeiroInput = terminal.nextInt();
      int segundoInput = terminal.nextInt();

      try {
        contar(primeiroInput, segundoInput);
      } catch (Error error) {
        if (error instanceof ParametrosInvalidosException) {
          System.out.println("O Segundo parametro deve ser maior que o primeiro.");
        }
      }
    }
  }

  static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
    if (primeiroNumero > segundoNumero) {
      throw new ParametrosInvalidosException();
    }

    int contagem = segundoNumero - primeiroNumero;

    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o numero: " + i);
    }

  }
}
