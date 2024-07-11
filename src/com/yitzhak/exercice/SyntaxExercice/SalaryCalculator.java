package com.yitzhak.exercice.SyntaxExercice;

import static java.lang.StringTemplate.STR;

import java.util.Scanner;

@SuppressWarnings("unused")
public class SalaryCalculator {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calculo de salario");

    System.out.println("Digite o valor do salario: ");
    float valorSalario = scanner.nextFloat();
    System.out.println("Digite o valor dos beneficios: ");
    float valorBeneficios = scanner.nextFloat();

    float valorImposto = 0;
    if (valorSalario >= 0 && valorSalario <= 1100) {
      valorImposto = 0.05F * valorSalario;
    } else if (valorSalario > 1100 && valorSalario <= 2500) {
      valorImposto = 0.10F * valorSalario;
    } else if (valorSalario > 2500) {
      valorImposto = 0.15F * valorSalario;
    }

    float saida = valorSalario - valorImposto + valorBeneficios;
    System.out.println(STR."Salario liquido: \{saida}");
  }
}
