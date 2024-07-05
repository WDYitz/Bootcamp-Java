package com.yitzhak.exercice;

import static java.lang.StringTemplate.STR;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Atm {
  private String name;
  private Object accountNumber;
  private double balance;
  public double withdrawValue;

  public Atm(int accountNumber, String name) {
    this.accountNumber = accountNumber;
    this.name = name;
  }

  public String deposit(double depositValue) {
    this.balance += depositValue;
    return STR."Você depositou \{depositValue}";
  }

  public String withdraw(double withdrawValue) {
    if (this.balance < withdrawValue) {
      return STR."Saldo insuficiente! Saldo atual: \{this.balance}";
    }
    this.balance -= withdrawValue;
    return STR."Saque realizado com sucesso! Saldo atual: \{this.balance}";
  }

  public String getBalance() {
    return STR."Saldo atual: \{this.balance}";
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Atm atm = new Atm(5362, "Yitzhak");
    System.out.println(STR."Olá, \{atm.getName()} \n1 - Depositar \n2 - Sacar \n3 - Ver Saldo \n4 - Sair");

    try (Scanner scanner = new Scanner(System.in)) {
      int option = scanner.nextInt();

      do {
        switch (option) {
          case 1:
            System.out.println("Digite o valor do depósito: ");
            double depositValue = scanner.nextDouble();
            System.out.println(atm.deposit(depositValue));
            break;
          case 2:
            System.out.println("Digite o valor do saque: ");
            double withdrawValue = scanner.nextDouble();
            System.out.println(atm.withdraw(withdrawValue));
            break;
          case 3:
            System.out.println(atm.getBalance());
            break;
          case 4:
            System.out.println("Obrigado por utilizar nossos serviços!");
            return;
          default:
            System.out.println("Opção inválida!");
        }
        System.out.println("Deseja realizar mais alguma açao? \n1 - Depositar \n2 - Sacar \n3 - Ver Saldo \n4 - Sair");
        option = scanner.nextInt();
      } while (option != 4);

    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  /*
   * public static class AtmMachine {
   * private String name;
   * private Object accountNumber;
   * private double balance;
   * public double withdrawValue;
   * 
   * public AtmMachine(int accountNumber, String name) {
   * this.accountNumber = accountNumber;
   * this.name = name;
   * }
   * 
   * public String deposit(double depositValue) {
   * this.balance += depositValue;
   * return STR."Você depositou \{depositValue}";
   * }
   * 
   * public String withdraw(double withdrawValue) {
   * if (this.balance < withdrawValue) {
   * return STR."Saldo insuficiente! Saldo atual: \{this.balance}";
   * }
   * this.balance -= withdrawValue;
   * return STR."Saque realizado com sucesso! Saldo atual: \{this.balance}";
   * }
   * 
   * public String getBalance() {
   * return STR."Saldo atual: \{this.balance}";
   * }
   * 
   * public String getName() {
   * return this.name;
   * }
   * }
   */
}
