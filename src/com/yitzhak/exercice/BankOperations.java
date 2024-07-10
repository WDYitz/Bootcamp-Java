package com.yitzhak.exercice;

import java.util.Scanner;

public class BankOperations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {
      int opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          double valorDeposito = scanner.nextDouble();
          saldo += valorDeposito;
          System.out.println("Saldo Atual: " + String.format("%.1f", saldo));
          break;
        case 2:
          double valorSaque = scanner.nextDouble();
          if (saldo < valorSaque) {
            System.out.println("Saldo insuficiente.");
            break;
          }
          saldo -= valorSaque;
          System.out.println("Saldo Atual: " + String.format("%.1f", saldo));
          break;
        case 3:
          System.out.println("Saldo Atual: " + String.format("%.1f", saldo));
          break;
        case 0:
          System.out.println("Programa encerrado.");
          continuar = false; // Atualiza a variável de controle para encerrar o loop
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }

    }
    scanner.close();
  }
}
