package com.yitzhak.secondweek.FunctionaInterfaces.BinaryOperator;

/*
 * BinaryOperator é uma interface funcional que representa uma função que recebe dois argumentos do mesmo tipo e retorna um valor do mesmo tipo.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    BinaryOperator<Integer> somarNumeros = (numero1, numero2) -> numero1 + numero2;
    int resultado = numeros.stream().reduce(0, somarNumeros);

    System.out.println("A Soma dos numeros é: " + resultado);
  }
}
